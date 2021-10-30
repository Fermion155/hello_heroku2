package com.heroku.hello_heroku.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
    public String showLoginPage(){
        return "hello";
    }
}
