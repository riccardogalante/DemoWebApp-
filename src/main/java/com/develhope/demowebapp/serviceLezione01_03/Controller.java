package com.develhope.demowebapp.serviceLezione01_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/album")
public class Controller {
    @Autowired
    public AlbumService albumService;
    //Create
    @PostMapping("/create")
    public ResponseEntity<Album> insertNewAlbum(@RequestBody Album album){
        if(albumService.checkDateIsFuture(album)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(album);
    }

}
