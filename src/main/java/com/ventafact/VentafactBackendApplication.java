package com.ventafact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class VentafactBackendApplication extends SpringBootServletInitializer{

	public static void main(String[] args) throws Exception{
		SpringApplication.run(VentafactBackendApplication.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VentafactBackendApplication.class);
    }
}
