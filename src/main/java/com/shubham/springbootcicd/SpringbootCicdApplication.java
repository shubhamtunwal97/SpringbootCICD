package com.shubham.springbootcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdApplication {

    @GetMapping("/welcome")

    public String welcome(){
        return "Welcome to my Spring CICD Project";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCicdApplication.class, args);
    }

}
