package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/demo")
public class Controller {

    @GetMapping ("/hello")
    public ResponseEntity<String> getMethodName(@RequestParam String param) {
        return ResponseEntity.status(HttpStatus.OK).body("hello veera");
    }

    @GetMapping ("/hi")
    public ResponseEntity<String> getMethodNames(@RequestParam String param) {
        return ResponseEntity.status(HttpStatus.OK).body("hello veera");
    }

}
