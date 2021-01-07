package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private Float amount;

    @Column(name="date")
    private LocalDate date;

    @JsonIgnoreProperties({"transactions"})
    @ManyToOne
    @JoinColumn(name="job_id", nullable = false)
    private Job job;

    @JsonIgnoreProperties({"transactions"})
    @ManyToOne
    @JoinColumn(name="account_id", nullable = false)
    private Account account;

    public Transaction(Long id, Float amount, LocalDate date, Job job, Account account) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.job = job;
        this.account = account;
    }

    public Transaction() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
