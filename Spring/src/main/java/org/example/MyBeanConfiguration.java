package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyBeanConfiguration {

    @Bean
    StringBuilder getStringBuilder() {
        return new StringBuilder("hello everyone");
    }

    @Bean
    @Primary
    Calc getCalc() {
        return new MyCalc();
    }

    @Bean(name = "calcNamedBean")
    Calc getCalc2() {
        return new MyCalc();
    }

    @Bean
    DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/demo_db");
        ds.setUsername("root");
        ds.setPassword("12345678");

        return ds;
    }
}
