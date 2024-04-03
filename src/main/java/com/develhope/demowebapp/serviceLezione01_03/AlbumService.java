package com.develhope.demowebapp.serviceLezione01_03;

import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class AlbumService {
    public boolean checkDateIsFuture(Album album){
        if (album.getAnno() == OffsetDateTime.now().getYear()){
            return true;
        }
        return false;
    }
}
