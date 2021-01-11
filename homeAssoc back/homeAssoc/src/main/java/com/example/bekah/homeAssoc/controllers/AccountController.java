package com.example.bekah.homeAssoc.controllers;

import com.example.bekah.homeAssoc.models.Account;
import com.example.bekah.homeAssoc.models.Building;
import com.example.bekah.homeAssoc.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AccountController {

    @Autowired
    AccountRepo accountRepo;

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts(){
        return new ResponseEntity<>(accountRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/accounts/{id}")
    public ResponseEntity getAccount(@PathVariable Long id){
        return new ResponseEntity<>(accountRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/accounts")
    public ResponseEntity<Account> postAccount(@RequestBody Account account){
        accountRepo.save(account);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/accounts/{id}")
    public ResponseEntity<Account> updateAccount(@RequestBody Account account){
        accountRepo.save(account);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @DeleteMapping(value = "/accounts/{id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable Long id) {
        Account found = accountRepo.getOne(id);
        accountRepo.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
