package com.coderscampus.week13.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@Configuration
@Profile("qa")
public class Week13QAConfiguration { // convention meaning part of the configuration of the web application
	
//	Illustration purposes only -> real world scenario of connecting to a database
//	@Bean
//	public Datasource datasource() {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://;lakdgs;lak.asd;lfans.com:3920");
//		db.setUsername("dev01asdff");
//		
//		return db;
//	}
	
	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}
	
	@Value("${superuser.username}")
	private String username;
	@Value("${superuser.password}")
	private String password;
	@Value("${superuser.name}")
	private String name;
	
	@Bean
	public User user () {
		return new User(username, password, name);
	}
}
