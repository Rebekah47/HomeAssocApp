package com.example.bekah.homeAssoc.controllers;

import com.example.bekah.homeAssoc.models.Contractor;
import com.example.bekah.homeAssoc.repositories.ContractorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ContractorController {

    @Autowired
    ContractorRepo contractorRepo;

    @GetMapping("/contractors")
    public ResponseEntity<List<Contractor>> getAllContractors(){
        return new ResponseEntity<>(contractorRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/contractors/{id}")
    public ResponseEntity getContractor(@PathVariable Long id){
        return new ResponseEntity<>(contractorRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/contractors")
    public ResponseEntity<Contractor> postContractor(@RequestBody Contractor contractor){
        contractorRepo.save(contractor);
        return new ResponseEntity<>(contractor, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/contractors/{id}")
    public ResponseEntity<Contractor> updateContractor(@RequestBody Contractor contractor){
        contractorRepo.save(contractor);
        return new ResponseEntity<>(contractor, HttpStatus.OK);
    }

    @DeleteMapping(value = "/contractors/{id}")
    public ResponseEntity<Contractor> deleteContractor(@PathVariable Long id) {
        Contractor found = contractorRepo.getOne(id);
        contractorRepo.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
