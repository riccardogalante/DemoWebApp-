package com.develhope.demowebapp.ceckpointlezione_11del03.service;

import com.develhope.demowebapp.ceckpointlezione_11del03.entity.Corsi;
import com.develhope.demowebapp.ceckpointlezione_11del03.entity.Studenti;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentiService {
    private ArrayList<Studenti> listStudenti = new ArrayList<>();
    public Studenti addStudent(Studenti studenti){
        listStudenti.add(studenti);
        return studenti;
    }
    public Studenti removeStudent(Integer id){
        Studenti studentDeleted = new Studenti();
        for (Studenti studenti : listStudenti){
            if(studenti.getStudente_id().equals(id)){
                listStudenti.remove(studenti);
                studentDeleted = studenti;
            }
        }
        return studentDeleted;
    }
    public Studenti getStudentiById(Integer id){
        Studenti studentTaked = new Studenti();
        for (Studenti studenti : listStudenti){
            if(studenti.getStudente_id().equals(id)){
                studentTaked = studenti;
            }
        }
        return studentTaked;
    }
    public List<Studenti> getAllStudent(){
        return listStudenti;
    }
    public Studenti updateStudent(Studenti studentToUpdate, Integer idToUpdate){
        Studenti studentUpdated = new Studenti();
        for (Studenti studenti : listStudenti){
            if(studenti.getStudente_id().equals(idToUpdate)){
                studenti.setStudente_id(studentToUpdate.getStudente_id());
                studenti.setNome(studentToUpdate.getNome());
                studenti.setCognome(studentToUpdate.getCognome());
                studentUpdated = studenti;
            }
        }
        return studentUpdated;
    }
    /**
     *
     * @param creditiValue Integer per il numero dei crediti
     * @return la lista degli studenti
     *          che hanno un corso che ha un credito maggiore di parametro
     */
    public ArrayList<Studenti> findStudent(Integer creditiValue){
        ArrayList<Studenti> studentListTemp = new ArrayList<>();
        for (Studenti studenti : listStudenti){
            for (Corsi corsi : studenti.getListaCorsi()){
                if(corsi.getCrediti() >= creditiValue){
                    studentListTemp.add(studenti);
                }
            }
        }
        return studentListTemp;
    }
}
