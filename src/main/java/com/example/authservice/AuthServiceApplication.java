package com.example.authservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageRestController {

  @Value("${democonfigclient.message:Hello default}")
  private String message;

  @GetMapping(path = "/democonfigclient")
  String getMessage() {
    return this.message;
  }
}