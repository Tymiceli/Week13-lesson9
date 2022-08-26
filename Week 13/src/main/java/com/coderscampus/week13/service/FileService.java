package com.coderscampus.week13.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service // can take the annotation 'service' away because we are not managing it as a component anymore 
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) this changes it from singleton to prototype and therefore creates multiples
public class FileService {
	private String fileName;
	
	public FileService() {
		// this is just a blank no arg constructor because we also 
		// have a 1-arg constructor explicitly defined below
		// Spring automatically uses no-arg constructors
	}
	
	public FileService(String fileName) {
		this.fileName = fileName;
	}

	public List<String> readFile () throws IOException {
		return Files.readAllLines(Paths.get(fileName));
	}
}
