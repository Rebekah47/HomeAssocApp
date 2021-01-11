package com.example.bekah.homeAssoc.controllers;

import com.example.bekah.homeAssoc.models.Flat;
import com.example.bekah.homeAssoc.models.Job;
import com.example.bekah.homeAssoc.repositories.FlatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlatController {

    @Autowired
    FlatRepo flatRepo;

    @GetMapping("/flats")
    public ResponseEntity<List<Flat>> getAllFlats(){
        return new ResponseEntity<>(flatRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/flats/{id}")
    public ResponseEntity getFlat(@PathVariable Long id){
        return new ResponseEntity<>(flatRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/flats")
    public ResponseEntity<Flat> postFlat(@RequestBody Flat flat){
        flatRepo.save(flat);
        return new ResponseEntity<>(flat, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/flats/{id}")
    public ResponseEntity<Flat> updateFlat(@RequestBody Flat flat){
        flatRepo.save(flat);
        return new ResponseEntity<>(flat, HttpStatus.OK);
    }

    @DeleteMapping(value = "/flats/{id}")
    public ResponseEntity<Flat> deleteFlat(@PathVariable Long id) {
        Flat found = flatRepo.getOne(id);
        flatRepo.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
