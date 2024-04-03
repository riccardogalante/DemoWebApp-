package com.develhope.demowebapp.esercizio2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es2")
public class ControllerEsercizio2 {
    @GetMapping("/ciaoTempo/{provincia}")
    public Utente salutaETempo(
            @RequestParam String nome,
            @PathVariable String provincia
    ){
        String collegamento = "Ciao "+ nome+ ", com'è il tempo in "+provincia+"?";
        return new Utente(nome, provincia, collegamento);
    }
}
