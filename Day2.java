package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
        @Value("Hello!!!")
        private String stringValue;
        
        @Value("$[sample.value]")  
        private String javaHome;
        
        @GetMapping("/")
        public String sayHello() {
        	return stringValue+javaHome;
        }
        
}