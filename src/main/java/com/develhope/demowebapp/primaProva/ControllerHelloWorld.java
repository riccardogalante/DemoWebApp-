package com.develhope.demowebapp.primaProva;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ControllerHelloWorld {
    //metodo senza parametri
    @GetMapping("/ciaoNormal")
    public String saluta(){
        return "Hello world";
    }
    //metodo con passaggio di un parametro
    @GetMapping("/ciaoParam")
    public String saluta(@RequestParam String nome){
        return "Hello world "+ nome+ "!";
    }
    //metodo con il passaggio di un oggetto
    @GetMapping("/ciaoUser")
    public User saluta(@RequestBody User userToCreate){
        return userToCreate;
    }
    //metodo con il passaggio di una lista di oggetti
    @GetMapping("/ciaoListUser")
    public List<User> saluta(@RequestBody List<User> userListToCreate){
        userListToCreate.remove(0);
        User utenteDaEliminare = null;
        for(User user : userListToCreate){
            if(user.getNome().equals("Mario")){
                utenteDaEliminare = user;
            }
        }
        userListToCreate.remove(utenteDaEliminare);
        return userListToCreate;
    }

}

