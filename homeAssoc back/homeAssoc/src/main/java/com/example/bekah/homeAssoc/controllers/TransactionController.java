package com.example.bekah.homeAssoc.controllers;

import com.example.bekah.homeAssoc.models.Transaction;
import com.example.bekah.homeAssoc.repositories.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    TransactionRepo transactionRepo;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getAllTransactions(){
        return new ResponseEntity<>(transactionRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/transactions/{id}")
    public ResponseEntity getTransaction(@PathVariable Long id){
        return new ResponseEntity<>(transactionRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/transactions")
    public ResponseEntity<Transaction> postTransaction(@RequestBody Transaction transaction){
        transactionRepo.save(transaction);
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/transactions/{id}")
    public ResponseEntity<Transaction> updateTransactions(@RequestBody Transaction transaction){
        transactionRepo.save(transaction);
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }

    @DeleteMapping(value = "/transactions/{id}")
    public ResponseEntity<Transaction> deleteTransactions(@PathVariable Long id) {
        Transaction found = transactionRepo.getOne(id);
        transactionRepo.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
