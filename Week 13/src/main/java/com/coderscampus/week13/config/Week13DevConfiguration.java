package com.coderscampus.week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@Configuration
@Profile("dev")
public class Week13DevConfiguration { // convention meaning part of the configuration of the web application
	
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
	
	@Bean
	public User user () {
		return new User("trevor@craftycodr", "asdfasdf", "Trevor Page");
	}
}
