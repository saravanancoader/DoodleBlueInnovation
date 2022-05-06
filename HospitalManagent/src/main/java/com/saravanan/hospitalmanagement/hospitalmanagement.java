package com.saravanan.hospitalmanagement;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
@EnableReactiveMethodSecurity 
@SpringBootApplication(exclude = { ErrorMvcAutoConfiguration.class })
public class hospitalmanagement implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(hospitalmanagement.class, args);
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
