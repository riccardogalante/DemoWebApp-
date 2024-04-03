package com.develhope.demowebapp.esControllerGETPOST;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceEs3 {
    public StringBuilder nomeAlContrario(@RequestParam StringBuilder nome){
        return nome.reverse();
    }
}
