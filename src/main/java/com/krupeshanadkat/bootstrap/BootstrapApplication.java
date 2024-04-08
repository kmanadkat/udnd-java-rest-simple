package com.krupeshanadkat.bootstrap;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Dogs REST API",
				version = "1.0.0",
				description = "Java Springboot - Learning To Build A Simple REST API",
				termsOfService = "",
				contact = @Contact(
						name = "Krupesh Anadkat",
						email = "krupeshanadkat16@gmail.com"
				),
				license = @License(
						name = "MIT",
						url = "https://github.com/kmanadkat/udnd-java-rest-simple?tab=MIT-1-ov-file#readme"
				)
		)
)
public class BootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}

}
