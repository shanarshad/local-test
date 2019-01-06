package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@EnableAutoConfiguration
@SpringBootConfiguration
public class ExampleService {

    AtomicInteger integer = new AtomicInteger();

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ResponseEntity<String> listAllUsers() {
        return new ResponseEntity<String>("{This is Demo Application Response no: " + integer.getAndIncrement() + "}", HttpStatus.OK);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleService.class, args);
    }
}
