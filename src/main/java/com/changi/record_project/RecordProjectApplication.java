package com.changi.record_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RecordProjectApplication  extends SpringBootServletInitializer {


	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		return application.sources(RecordProjectApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(RecordProjectApplication.class, args);
		
	}
}
