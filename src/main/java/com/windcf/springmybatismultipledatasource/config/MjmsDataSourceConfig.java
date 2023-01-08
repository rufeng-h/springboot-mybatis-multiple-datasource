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
@MapperScan(basePackages = "com.windcf.springmybatismultipledatasource.mapper.mjms", sqlSessionTemplateRef = MjmsDataSourceConfig.SESSION_TEMP_NAME)
@EnableConfigurationProperties({MjmsDataSourceConfig.MjmsDataSourceProperties.class, MjmsDataSourceConfig.MjmsMybatisProperties.class})
public class MjmsDataSourceConfig {
    public static final String TRANSACTION_MANAGER = "mjmsTransactionManager";
    public static final String DATASOURCE_BEAN_NAME = "mjmsDataSource";
    public static final String SESSION_TEMP_NAME = "mjmsSqlSessionTemplate";
    public static final String SESSION_FACTORY_NAME = "mjmsSqlSessionFactory";
    private final ResourceLoader resourceLoader;

    private final MjmsMybatisProperties properties;

    public MjmsDataSourceConfig(ResourceLoader resourceLoader, MjmsMybatisProperties properties) {
        this.resourceLoader = resourceLoader;
        this.properties = properties;
        System.out.println(this.properties.getConfiguration());
    }

    @Bean
    public TransactionManager mjmsTransactionManager(@Qualifier(DATASOURCE_BEAN_NAME) DataSource dataSource) {
        return new JdbcTransactionManager(dataSource);
    }

    @ConfigurationProperties(prefix = "mybatis.mjms")
    protected static class MjmsMybatisProperties extends MybatisProperties {

    }

    @Data
    @ConfigurationProperties(prefix = "spring.datasource.mjms")
    protected static class MjmsDataSourceProperties {
        private String username;
        private String password;
        private String driverClassName;
        private String url;
    }

    @Bean
    public DataSource mjmsDataSource(MjmsDataSourceProperties properties) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(properties.url);
        dataSource.setPassword(properties.password);
        dataSource.setUsername(properties.username);
        dataSource.setDriverClassName(properties.driverClassName);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory mjmsSqlSessionFactory(@Qualifier(DATASOURCE_BEAN_NAME) DataSource dataSource) throws Exception {
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
    public SqlSessionTemplate mjmsSqlSessionTemplate(@Qualifier(SESSION_FACTORY_NAME) SqlSessionFactory sqlSessionFactory) {
        ExecutorType executorType = this.properties.getExecutorType();
        if (executorType != null) {
            return new SqlSessionTemplate(sqlSessionFactory, executorType);
        } else {
            return new SqlSessionTemplate(sqlSessionFactory);
        }
    }
}
