package com.spring.exercises.greetinginternationalization;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", required = false) String name) {
		if (name == null)
			return new Greeting(counter.incrementAndGet(), Translator.toLocale("hello"));
		
		return new Greeting(counter.incrementAndGet(), String.format(Translator.toLocale("template"), name));
	}
}
