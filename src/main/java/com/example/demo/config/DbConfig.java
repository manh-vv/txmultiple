package com.example.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {"com.example.demo.domain"})
@EnableJpaRepositories(basePackages = {"com.example.demo.domain"})
@EnableTransactionManagement(proxyTargetClass = true)
public class DbConfig {
}