package com.employee.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class Application_Configration {

	// steep 1
	// DATA SOURCE CONNECT US TO DATABASE
	@Bean
	public DataSource dataSourc() {
		
		MysqlDataSource theDataSource = new MysqlDataSource();
		
		theDataSource.setUrl("jdbc:mysql://localhost:3306/admin_employee?useSSL=false");
		theDataSource.setUser("matin");
		theDataSource.setPassword("1989");
		
		
		return theDataSource;
	}
	
	
	// step
	// jdbctemplate 
	
	@Bean("jdbcTemplate")
	
	public JdbcTemplate createTemplate() {
		
		JdbcTemplate theJdbcTemplate = new JdbcTemplate(this.dataSourc());
		
		return theJdbcTemplate;
	}
	
	
}
