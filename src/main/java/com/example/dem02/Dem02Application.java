package com.example.dem02;

import com.example.dem02.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Dem02Application {


	@PostMapping("/register")
	public String addUser(@RequestBody User user) {
		System.out.println(user.name);
		System.out.println(user.email);


		return"successfully registered";


	}


	public static void main(String[] args) {
		SpringApplication.run(Dem02Application.class, args);
	}

}
