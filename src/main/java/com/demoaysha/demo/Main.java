package com.demoaysha.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "HomePage";
	}

	@GetMapping("json")
	public Greet hello() {
		return new Greet("Hello World");
	}

	record Greet(String val) {
	}

	// Json before Jackson
	@GetMapping("json/list")
	public ListJson listing() {
		ListJson val = new ListJson(
				"Hello",
				List.of("Java", "Swift", "C#"),
				List.of(new Person("Allen", 30), new Person("Sid", 27), new Person("George", 24)),
				new Person("Alex", 25));
		return val;
	}

	record Person(
			String name,
			int age) {
	}

	record ListJson(
			String greet,
			List<String> favProgram,
			List<Person> friends,
			Person person) {
	}

	// Json before Jackson

	@GetMapping("world")
	public String hi(@RequestParam String val) {
		return "Hello " + val;
	}

}
