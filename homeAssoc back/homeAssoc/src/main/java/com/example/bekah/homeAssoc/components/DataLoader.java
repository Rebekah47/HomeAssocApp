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

        Account account1 = new Account(2500.50, "6 Whitefield Road, Glasgow, G51 2YD");
        accountRepo.save(account1);

        Flat flat1 = new Flat("0/1", false, account1);
        flatRepo.save(flat1);
        Flat flat2 = new Flat("0/2", false, account1);
        flatRepo.save(flat2);
        Flat flat3 = new Flat("1/1", true, account1);
        flatRepo.save(flat3);
        Flat flat4 = new Flat("1/2", true, account1);
        flatRepo.save(flat4);
        Flat flat5 = new Flat("2/1", true, account1);
        flatRepo.save(flat5);
        Flat flat6 = new Flat("2/2", true, account1);
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

        Contractor contractor1 = new Contractor("Ralph", "07877765432", "handyman", account1);
        contractorRepo.save(contractor1);
        Contractor contractor2 = new Contractor("Bob", "07655432136", "roofer", account1);
        contractorRepo.save(contractor2);
        Contractor contractor3 = new Contractor("Bill", "07879999432", "plumber", account1);
        contractorRepo.save(contractor3);
        Contractor contractor4 = new Contractor("Connor", "07888776654", "cleaner", account1);
        contractorRepo.save(contractor4);

        Job job1 = new Job("new roof", "need to fix the roof", flat6, account1, true, true, 500.20, "the roof", contractor2);
        Job job2 = new Job("fix stairs", "stair upstairs has crumbled", flat2, account1, false, false,300.50, "the stairs", contractor1);
        Job job3 = new Job("cut down tree", "the tree outside is dying and needs cut down", flat6, account1, true,false, 250.60, "the garden", contractor1);
        Job job4 = new Job("clean close", "the close needs a good scrub", flat5, account1, true, true,20.60, "the close", contractor4);
        Job job5 = new Job("Pipe broken", "Pipe leaking into first floor flat", flat3, account1, false, false,2000.80, "flat 1/1", contractor3);
        jobRepo.save(job1);
        jobRepo.save(job2);
        jobRepo.save(job3);
        jobRepo.save(job4);
        jobRepo.save(job5);

    }


}
