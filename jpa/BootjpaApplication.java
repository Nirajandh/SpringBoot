package com.Boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Boot.jpa.dao.UserRepo;
import com.Boot.jpa.entities.User;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext con=
		SpringApplication.run(BootjpaApplication.class, args);
		
		UserRepo bean = con.getBean(UserRepo.class);
		
		User u=new User();
		
		u.setName("niranjan");
		u.setCity("Pune");
		
		User user1 = bean.save(u);
		
		System.out.println(user1);
		
	}

}
