package br.com.calixto;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.Profiles;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {		
		SpringApplication.run(Startup.class, args);
	}

}
