package com.smartcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.smartcampus")
public class WebConfig implements WebMvcConfigurer {

    // 1. View Resolver (For JSP pages)
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    // 2. Database Connection Setup
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // MySQL 8+ Driver
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // Your database URL (smartcampus_db)
        dataSource.setUrl("jdbc:mysql://localhost:3306/smartcampus_db?useSSL=false&serverTimezone=UTC");
        // Default MySQL username
        dataSource.setUsername("root");
        // CHANGE THIS if your MySQL has a password (e.g., "root" or "1234")
        dataSource.setPassword("");

        return dataSource;
    }

    // 3. JdbcTemplate (The tool we use to execute SQL queries)
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}