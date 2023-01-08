package com.windcf.springmybatismultipledatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author chunf
 */
@SpringBootApplication
@EnableTransactionManagement
public class SpringMybatisMultipleDatasourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringMybatisMultipleDatasourceApplication.class, args);
    }

}
