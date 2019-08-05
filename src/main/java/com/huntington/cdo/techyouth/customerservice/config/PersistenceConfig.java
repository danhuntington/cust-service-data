package com.huntington.cdo.techyouth.customerservice.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource({ "classpath:persistence.properties" })
public class PersistenceConfig
{
	@Autowired
	private Environment env;

	/***
	@Value("classpath:schema.sql")
	private Resource schemaScript;

	@Value("classpath:data.sql")
	private Resource dataScript;
	***/
	
	/***
	@Bean
	public DataSourceInitializer dataSourceInitializer(
			final DataSource dataSource)
	{
		final DataSourceInitializer initializer = new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		//initializer.setDatabasePopulator(databasePopulator());
		return initializer;
	}
	***/

	/***
	private DatabasePopulator databasePopulator()
	{
		final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(schemaScript);
		populator.addScript(dataScript);
		return populator;
	}
	***/
	
	@Bean
	public DataSource dataSource()
	{
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.user"));
		dataSource.setPassword(env.getProperty("jdbc.pass"));
		return dataSource;
	}

}
