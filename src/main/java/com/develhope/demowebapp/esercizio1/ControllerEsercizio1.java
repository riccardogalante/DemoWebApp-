package com.develhope.demowebapp.esercizio1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es1")
public class ControllerEsercizio1 {
    @GetMapping("/ciaoTempo")
    public String salutaETempo(@RequestParam String nome, @RequestParam String provincia){
        return "Ciao "+ nome+ ", com'è il tempo in "+provincia;
    }
}
