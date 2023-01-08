package com.windcf.springmybatismultipledatasource.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

/**
 * @author : chunf
 */
@Configuration
@EnableConfigurationProperties({AmsDataSourceConfig.AmsDataSourceProperties.class, AmsDataSourceConfig.AmsMybatisProperties.class})
@MapperScan(basePackages = "com.windcf.springmybatismultipledatasource.mapper.ams", sqlSessionTemplateRef = AmsDataSourceConfig.SESSION_TEMP_NAME)
public class AmsDataSourceConfig {
    public static final String SESSION_TEMP_NAME = "amsSqlSessionTemplate";
    public static final String SESSION_FACTORY_NAME = "amsSqlSessionFactory";
    private final ResourceLoader resourceLoader;
    private final AmsMybatisProperties properties;

    public AmsDataSourceConfig(ResourceLoader resourceLoader, AmsMybatisProperties properties) {
        this.resourceLoader = resourceLoader;
        this.properties = properties;
    }

    @Data
    @ConfigurationProperties(prefix = "spring.datasource.ams")
    protected static class AmsDataSourceProperties {
        private String driverClassName;
        private String username;
        private String password;
        private String url;
    }

    @ConfigurationProperties(prefix = "mybatis.ams")
    static class AmsMybatisProperties extends MybatisProperties {

    }

    @Bean
    @Primary
    public TransactionManager amsTransactionManager(@Qualifier("amsDataSource") DataSource dataSource) {
        return new JdbcTransactionManager(dataSource);
    }

    @Bean
    DataSource amsDataSource(AmsDataSourceProperties properties) {
        HikariDataSource source = new HikariDataSource();
        source.setDriverClassName(properties.driverClassName);
        source.setUsername(properties.username);
        source.setPassword(properties.password);
        source.setJdbcUrl(properties.url);
        return source;
    }

    @Bean
    public SqlSessionFactory amsSqlSessionFactory(@Qualifier("amsDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setVfs(SpringBootVFS.class);
        if (StringUtils.hasText(this.properties.getConfigLocation())) {
            factory.setConfigLocation(this.resourceLoader.getResource(this.properties.getConfigLocation()));
        }
        if (this.properties.getConfigurationProperties() != null) {
            factory.setConfigurationProperties(this.properties.getConfigurationProperties());
        }
        /* 代替applyConfiguration */
        factory.setConfiguration(new org.apache.ibatis.session.Configuration());
//        applyConfiguration(factory);

//        if (!ObjectUtils.isEmpty(this.interceptors)) {
//            factory.setPlugins(this.interceptors);
//        }
        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
            factory.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
        }
        if (this.properties.getTypeAliasesSuperType() != null) {
            factory.setTypeAliasesSuperType(this.properties.getTypeAliasesSuperType());
        }
        if (StringUtils.hasLength(this.properties.getTypeHandlersPackage())) {
            factory.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
        }
//        if (this.databaseIdProvider != null) {
//            factory.setDatabaseIdProvider(this.databaseIdProvider);
//        }
//        if (!ObjectUtils.isEmpty(this.typeHandlers)) {
//            factory.setTypeHandlers(this.typeHandlers);
//        }
        Resource[] mapperLocations = this.properties.resolveMapperLocations();
        if (!ObjectUtils.isEmpty(mapperLocations)) {
            factory.setMapperLocations(mapperLocations);
        }
//        Set<String> factoryPropertyNames = Stream.of(new BeanWrapperImpl(SqlSessionFactoryBean.class).getPropertyDescriptors()).map(PropertyDescriptor::getName).collect(Collectors.toSet());
//        Class<? extends LanguageDriver> defaultLanguageDriver = this.properties.getDefaultScriptingLanguageDriver();
//        if (factoryPropertyNames.contains("scriptingLanguageDrivers") && !ObjectUtils.isEmpty(this.languageDrivers)) {
//            // Need to mybatis-spring 2.0.2+
//            factory.setScriptingLanguageDrivers(this.languageDrivers);
//            if (defaultLanguageDriver == null && this.languageDrivers.length == 1) {
//                defaultLanguageDriver = this.languageDrivers[0].getClass();
//            }
//        }
//        if (factoryPropertyNames.contains("defaultScriptingLanguageDriver")) {
//            // Need to mybatis-spring 2.0.2+
//            factory.setDefaultScriptingLanguageDriver(defaultLanguageDriver);
//        }
//        applySqlSessionFactoryBeanCustomizers(factory);
        return factory.getObject();
    }

    @Bean
    public SqlSessionTemplate amsSqlSessionTemplate(@Qualifier(SESSION_FACTORY_NAME) SqlSessionFactory sqlSessionFactory) {
        ExecutorType executorType = this.properties.getExecutorType();
        if (executorType != null) {
            return new SqlSessionTemplate(sqlSessionFactory, executorType);
        } else {
            return new SqlSessionTemplate(sqlSessionFactory);
        }
    }

}
