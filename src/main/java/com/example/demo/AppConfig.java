package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {
	
@RequestMapping("/mes")
 
public String mess() {
	return "hello pc";
}
}
