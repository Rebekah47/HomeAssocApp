package com.example.bekah.homeAssoc.controllers;

import com.example.bekah.homeAssoc.models.Job;
import com.example.bekah.homeAssoc.models.User;
import com.example.bekah.homeAssoc.repositories.JobRepo;
import com.example.bekah.homeAssoc.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobRepo jobRepo;

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        return new ResponseEntity<>(jobRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/jobs/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return new ResponseEntity<>(jobRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/jobs")
    public ResponseEntity<Job> postJob(@RequestBody Job job){
        jobRepo.save(job);
        return new ResponseEntity<>(job, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/jobs/{id}")
    public ResponseEntity<Job> updateJob(@RequestBody Job job){
        jobRepo.save(job);
        return new ResponseEntity<>(job, HttpStatus.OK);
    }

    @DeleteMapping(value = "/jobs/{id}")
    public ResponseEntity<Job> deleteJob(@PathVariable Long id) {
        Job found = jobRepo.getOne(id);
        jobRepo.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
