package com.spring.nifi.adminconsole;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "tmEntityManagerFactory", transactionManagerRef = "tmTransactionManager", basePackages = {
		"com.spring.nifi.adminconsole.tmdao" })
public class TmDbConfig {

	@Bean(name = "tmDataSource")
	@ConfigurationProperties(prefix = "spring.tmdatasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "tmEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean tmEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("tmDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.spring.nifi.adminconsole.tm.model").persistenceUnit("SHPM_T")
				.build();
	}

	@Bean(name = "tmTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("tmEntityManagerFactory") EntityManagerFactory tmEntityManagerFactory) {
		return new JpaTransactionManager(tmEntityManagerFactory);
	}

}
