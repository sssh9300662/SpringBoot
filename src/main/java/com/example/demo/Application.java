package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@RestController
    class SimpleController {

        @GetMapping
        public Map<String, String> hello() {
            Map<String, String> map = new HashMap<String, String>();
            map.put("say", "hello");
            return map;
        }
    }

}
