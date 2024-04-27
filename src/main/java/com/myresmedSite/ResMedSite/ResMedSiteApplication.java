package com.myresmedSite.ResMedSite;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResMedSiteApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ResMedSiteApplication.class, args);
		SpringApplication app = new SpringApplication(ResMedSiteApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8096"));
        app.run(args);
		
		
	}

}
