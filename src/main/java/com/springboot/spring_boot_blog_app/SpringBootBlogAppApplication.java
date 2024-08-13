package com.springboot.spring_boot_blog_app;

import com.springboot.spring_boot_blog_app.entity.Role;
import com.springboot.spring_boot_blog_app.repository.RoleRepository;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title="Spring Boot Blog App REST APIs",
				description = "Spring Boot Blog App REST APIs Documentation",
				version = "v1..0",
				contact = @Contact(
						name = "Ramyalakshmi.M",
						email = "ramyagandhi16@gmail.com",
						url = "https://github.com/Ramyalakshmi-tech/BlogApp"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Blog App REST APIs Documentation",
				url = "https://github.com/Ramyalakshmi-tech/BlogApp"
		)
)
public class SpringBootBlogAppApplication implements CommandLineRunner {
@Bean
	public ModelMapper modelMapper(){

	return new ModelMapper();
	}

	public static void main(String[] args) {

	SpringApplication.run(SpringBootBlogAppApplication.class, args);
	}
	@Autowired
private RoleRepository roleRepository;
	@Override
	public void run(String... args) throws Exception {
		Role adminRole=new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		Role userRole=new Role();
		userRole.setName("ROLE_USER");
		roleRepository.save(userRole);
	}
}
