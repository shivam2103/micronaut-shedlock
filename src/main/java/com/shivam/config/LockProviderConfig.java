package com.shivam.config;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbc.micronaut.MicronautJdbcLockProvider;

import javax.sql.DataSource;

@Factory
public class LockProviderConfig {
    @Bean
    public LockProvider lockProvider(DataSource dataSource) {
        return new MicronautJdbcLockProvider(dataSource);
    }
}