package com.example.demo;

import com.example.demo.beans.Animal;
import com.example.demo.config.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleProfilesPropertiesYamlApplication implements CommandLineRunner {

	@Autowired
	private Animal animal;

	@Autowired
	private YAMLConfig yamlConfig;

	@Value("${company.name}")
	private String company;

	@Value("${datasource.username}")
	private String username;

	public static void main(String[] args) {
		SpringApplication.run(MultipleProfilesPropertiesYamlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(animal);
		animal.makeSound();
		System.out.println("company name : " + company);
		System.out.println("username : " + username);

		System.out.println("using environment: " + yamlConfig.getEnvironment());
		System.out.println("name: " + yamlConfig.getName());
		System.out.println("enabled:" + yamlConfig.isEnabled());
		System.out.println("servers: " + yamlConfig.getServers());
	}

}


