package com.example.dem02;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@EnableJpaRepositories
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Dem02Application {

	@Autowired
	UserRepository users;

	@PostMapping("/register")

	public String addUser(@RequestBody UserModel usermodel) {

		String name=usermodel.getName();
		String email=usermodel.getEmail();
		String mnumber=usermodel.getMobilenumber();
		String pwd=usermodel.getPsw();
		String pswrepeat=usermodel.getPswrepeat();
		System.out.println("name is"+name);
		System.out.println("email is"+email);
		System.out.println("mnumber is"+mnumber);
		System.out.println("psw is"+pwd);
		System.out.println("pswrepeat is"+pswrepeat);
		User userentity=new User();
		userentity.setName(name);
		userentity.setEmail(email);
		userentity.setMobilenumber(mnumber);
		userentity.setPsw(pwd);
		userentity.setPswrepeat(pswrepeat);



		users.save(userentity);
		return "Successfully Registered";


	}


	public static void main(String[] args) {
		SpringApplication.run(Dem02Application.class, args);
	}

}
