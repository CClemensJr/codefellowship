package com.superfamicomcoder.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CodefellowshipApplication {
	@Autowired
	ApplicationUserRepository appUserRepo;

	@Autowired
	PasswordEncoder bCryptPasswordEncoder;

	@EventListener
	public void seedDB(ContextRefreshedEvent event) {
		seedTables();
	}

	public static void main(String[] args) {
		SpringApplication.run(CodefellowshipApplication.class, args);
	}

	private void seedTables() {
		// First name last name bio
		ApplicationUser user1 = new ApplicationUser(
				"user1",
				bCryptPasswordEncoder.encode("1234"),
				"Chester",
				"Cheeta",
				"12/08/1980",
				"I love cheetos soooo much");

		ApplicationUser user2 = new ApplicationUser(
				"user2",
				bCryptPasswordEncoder.encode("1234"),
				"Lucky",
				"Strike",
				"12/10/2000",
				"I love airplanes soooo much");

		ApplicationUser user3 = new ApplicationUser(
				"user3",
				bCryptPasswordEncoder.encode("1234"),
				"Passion",
				"Fruit",
				"01/01/2001",
				"I love passion fruit soooo much");

		ApplicationUser user4 = new ApplicationUser(
				"user4",
				bCryptPasswordEncoder.encode("1234"),
				"Luke",
				"Vader",
				"03/31/1913",
				"I love star wars soooo much");

		ApplicationUser user5 = new ApplicationUser(
				"user5",
				bCryptPasswordEncoder.encode("1234"),
				"Ford",
				"Mustang",
				"06/07/2017",
				"I love mustangs soooo much");

		appUserRepo.save(user1);
		appUserRepo.save(user2);
		appUserRepo.save(user3);
		appUserRepo.save(user4);
		appUserRepo.save(user5);

	}
}
