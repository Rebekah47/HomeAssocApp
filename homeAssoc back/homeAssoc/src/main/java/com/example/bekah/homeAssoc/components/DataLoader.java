package com.example.bekah.homeAssoc.components;

import com.example.bekah.homeAssoc.models.Account;
import com.example.bekah.homeAssoc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AccountRepo accountRepo;


    @Autowired
    ContractorRepo contractorRepo;

    @Autowired
    FlatRepo flatRepo;

    @Autowired
    JobRepo jobRepo;

    @Autowired
    TransactionRepo transactionRepo;

    @Autowired
    UserRepo userRepo;

    public DataLoader(){}

    public void run(ApplicationArguments args){

    }


}
