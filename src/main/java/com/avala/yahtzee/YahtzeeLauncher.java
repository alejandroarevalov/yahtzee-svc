package com.avala.yahtzee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class YahtzeeLauncher {

	public static void main(String[] args) {
		SpringApplication.run(YahtzeeLauncher.class, args);
	}

}
