package com.rdas.db.legacy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.rdas.db.legacy.persistence")
public class PersistenceConfig {
}
