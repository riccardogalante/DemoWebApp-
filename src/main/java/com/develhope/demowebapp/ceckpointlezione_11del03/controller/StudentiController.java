package com.develhope.demowebapp.ceckpointlezione_11del03.controller;

import com.develhope.demowebapp.ceckpointlezione_11del03.entity.Studenti;
import com.develhope.demowebapp.ceckpointlezione_11del03.service.StudentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studenti")
public class StudentiController {
    @Autowired
    private StudentiService studentiService;
    @PostMapping("/add")
    public ResponseEntity<Studenti> addStudent(@RequestBody Studenti studenti){
        Studenti studentAdded = studentiService.addStudent(studenti);
        return ResponseEntity.ok().body(studentAdded);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Studenti> deleteStudent(@PathVariable Integer id){
        Studenti studentRemoved = studentiService.removeStudent(id);
        return ResponseEntity.ok().body(studentRemoved);
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Studenti> selectStudentById(@PathVariable Integer id){
        Studenti studentTaked = studentiService.getStudentiById(id);
        return ResponseEntity.ok().body(studentTaked);
    }
    @GetMapping("/allStudet")
    public ResponseEntity<List<Studenti>> selectAllStudent(){
        List<Studenti> allStudent = studentiService.getAllStudent();
        return ResponseEntity.ok().body(allStudent);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Studenti> updateStudent(@RequestBody Studenti studenti, @PathVariable Integer id){
        Studenti studentUpdated = studentiService.updateStudent(studenti,id);
        return ResponseEntity.ok().body(studentUpdated);
    }
}