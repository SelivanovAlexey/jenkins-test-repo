package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> getResponse(HttpServletRequest request) {
        return ResponseEntity.ok().body("Hello from Spring Boot");
    }
}
