package com.uracles.banking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}

//	@RestController
//	static
//	class TestController {
//		@GetMapping("/ping")
//		public String ping() {
//			return "pong " + Instant.now();
//		}
//	}


}




