package com.develhope.demowebapp.ceckpointlezione_11del03;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cp1")
public class ControllerHelloApp {
    @PostMapping("/hello")
    public String saluto(@RequestBody String nome){
        return "Hello "+ nome;
    }
}
