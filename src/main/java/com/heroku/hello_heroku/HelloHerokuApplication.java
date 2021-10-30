package com.heroku.hello_heroku;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.heroku.hello_heroku")
public class HelloHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHerokuApplication.class, args);
		System.out.println("Press 'Enter' to terminate");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		System.out.println("Exiting");
		s.close();
		System.exit(1);
	}

}
