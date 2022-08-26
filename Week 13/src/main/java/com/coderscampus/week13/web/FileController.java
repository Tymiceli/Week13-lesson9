package com.coderscampus.week13.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;

@RestController
public class FileController {
	
	@Value("${superuser.username}")
	private String superuserUsername;
	
	@Value("${superuser.password}")
	private String superuserPassword;
	
	@Value("${superuser.name}")
	private String superuserName;
	
	
	// Can omit if using applicationContext.getBean(ClassName.class)
	@Autowired
	private FileService fileService;
	
	@Autowired
	private User user;

	@GetMapping("/read-lines")
	public List<String> readLines() throws IOException {
		System.out.println(user);
		
		System.out.println(superuserUsername);
		System.out.println(superuserPassword);
		System.out.println(superuserName);
		
		return fileService.readFile();
	}
	
	@GetMapping("/hello-world") 
	public String helloWorld() {
		return "Hello World!";
	}
	
	@PostMapping("/hello-world")
	public String helloWorldPost() {
		return "Okay cool, you just posted some data."; 
	}
}
