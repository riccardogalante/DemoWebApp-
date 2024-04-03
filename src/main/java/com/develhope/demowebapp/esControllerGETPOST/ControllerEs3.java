package com.develhope.demowebapp.esControllerGETPOST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es3")
public class ControllerEs3 {
    @Autowired
    public ServiceEs3 nomeService;

    @GetMapping("/nome")
    public String nome(@RequestParam String nome){
        return nome;
    }

    @PostMapping("contrario")
    public StringBuilder nomeAlContrario(@RequestParam StringBuilder nome){
        return nomeService.nomeAlContrario(new StringBuilder(nome));
    }
}
