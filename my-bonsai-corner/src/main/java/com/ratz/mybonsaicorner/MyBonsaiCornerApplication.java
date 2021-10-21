package com.ratz.mybonsaicorner;

import com.ratz.mybonsaicorner.entities.Bonsai;
import com.ratz.mybonsaicorner.services.BonsaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MyBonsaiCornerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBonsaiCornerApplication.class, args);
	}

}
