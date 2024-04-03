package com.develhope.demowebapp.esercizioLezione01_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/esLez1")
public class ProductController {
    @Autowired
    public ProductService productService;

//    @PostMapping
//    public
}
