package com.demoaysha.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
@RestController
public class Main {
	public static void main(String[] args){
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/")
	public String greet(){
		return "HomePage";
	}

	@GetMapping("hello")
	public String hello(){
		return "Hello World";
	}

	@GetMapping("world")
	public String hi(@RequestParam String val){
		return "Hello " + val;
	}

	
	
}
