package com.example.bekah.homeAssoc.components;

import com.example.bekah.homeAssoc.models.*;
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

        Flat flat1 = new Flat("0/1", false);
        flatRepo.save(flat1);
        Flat flat2 = new Flat("0/2", false);
        flatRepo.save(flat2);
        Flat flat3 = new Flat("1/1", true);
        flatRepo.save(flat3);
        Flat flat4 = new Flat("1/2", true);
        flatRepo.save(flat4);
        Flat flat5 = new Flat("2/1", true);
        flatRepo.save(flat5);
        Flat flat6 = new Flat("2/2", true);
        flatRepo.save(flat6);

        User user1 = new User("Adam", flat6);
        userRepo.save(user1);
        User user2 = new User("Bekah", flat6);
        userRepo.save(user2);
        User user3 = new User("Sean", flat2);
        userRepo.save(user3);
        User user4 = new User("Chloe", flat2);
        userRepo.save(user4);
        User user5 = new User("John", flat5);
        userRepo.save(user5);
        User user6 = new User("Ian", flat5);
        userRepo.save(user6);
        User user7 = new User("Scotty", flat4);
        userRepo.save(user7);
        User user8 = new User("Sergi", flat4);
        userRepo.save(user8);
        User user9 = new User("Isabelle", flat1);
        userRepo.save(user9);
        User user10 = new User("Robin", flat3);
        userRepo.save(user10);

        Contractor contractor1 = new Contractor("plumber", "07877765432", "plumber");
        contractorRepo.save(contractor1);
        Contractor contractor2 = new Contractor("roofer", "07655432136", "roofer");
        contractorRepo.save(contractor2);

        Job job1 = new Job("new roof", "need to fix the roof", flat6, false, 500.20, "the roof");


    }


}
