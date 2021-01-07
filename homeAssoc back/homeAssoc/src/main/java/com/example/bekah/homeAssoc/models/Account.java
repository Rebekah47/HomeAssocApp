package com.example.bekah.homeAssoc.models;

import java.util.List;

public class Account {
    private Long id;
    private List<Transaction> transactions;
    private List<Job>proposed;
    private List<Job>accepted;
    private List<Job>rejected;
    private List<Job>completed;
    private List<Job>in_progress;
    private Building building;
    private Float pot;
}
