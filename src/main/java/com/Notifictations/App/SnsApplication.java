package com.Notifictations.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.Notifictations.Controller")
public class SnsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
	}
}
