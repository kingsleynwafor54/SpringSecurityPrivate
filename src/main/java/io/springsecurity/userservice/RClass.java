package io.springsecurity.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Hello")
public class RClass {
    @GetMapping("Hello")
    public String printHelloWorld(){
        return "Hello world";
    }
}

