package com.develhope.demowebapp.ceckpointlezione_11del03.service;

import com.develhope.demowebapp.ceckpointlezione_11del03.entity.Corsi;

import java.util.ArrayList;
import java.util.List;

public class CorsiService {
    private ArrayList<Corsi> listOfCors = new ArrayList<>();
    public Corsi addCors(Corsi cors){
        listOfCors.add(cors);
        return cors;
    }
    public Corsi deleteCors(Corsi cors){
        listOfCors.remove(cors);
        return cors;
    }
    public Corsi returnCorsById(Integer id){
        Corsi corsFound = new Corsi();
        for (Corsi cors : listOfCors){
            if(cors.getCorso_id().equals(id)){
                corsFound = cors;
            }
        }
        return corsFound;
    }
    public List<Corsi> returnAllCors(){
        return listOfCors;
    }
    public Corsi updateCors(Corsi corsToUpdate, Integer id){
        Corsi corsUpdated = new Corsi();
        for (Corsi cors: listOfCors){
            if(cors.getCorso_id().equals(id)){
                cors.setNomeCorso(corsToUpdate.getNomeCorso());
                cors.setCrediti(corsToUpdate.getCrediti());
                cors.setCorso_id(corsToUpdate.getCorso_id());
                corsUpdated = cors;
            }
        }
        return corsUpdated;
    }
}
