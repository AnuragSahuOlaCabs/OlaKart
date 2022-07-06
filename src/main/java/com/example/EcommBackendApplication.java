package com.example;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.UserRepository;
import com.example.entities.User;



@SpringBootApplication
public class EcommBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommBackendApplication.class, args);
	}
}
