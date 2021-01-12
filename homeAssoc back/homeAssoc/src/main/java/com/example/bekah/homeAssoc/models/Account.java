package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Job> proposed;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Job> accepted;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Job> rejected;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Job> completed;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Job> in_progress;


    @Column(name = "pot")
    private Double pot;

    @Column(name="address")
    private String address;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Flat> flats;


    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Contractor> contractors;

    public Account(Double pot, String address) {
        this.transactions = new ArrayList<Transaction>();
        this.proposed = new ArrayList<Job>();
        this.accepted = new ArrayList<Job>();
        this.rejected = new ArrayList<Job>();
        this.completed = new ArrayList<Job>();
        this.in_progress = new ArrayList<Job>();
        this.pot = pot;
        this.address = address;
        this.flats = new ArrayList<Flat>();
        this.contractors = new ArrayList<Contractor>();
    }

    public Account() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Job> getProposed() {
        return proposed;
    }

    public void setProposed(List<Job> proposed) {
        this.proposed = proposed;
    }

    public List<Job> getAccepted() {
        return accepted;
    }

    public void setAccepted(List<Job> accepted) {
        this.accepted = accepted;
    }

    public List<Job> getRejected() {
        return rejected;
    }

    public void setRejected(List<Job> rejected) {
        this.rejected = rejected;
    }

    public List<Job> getCompleted() {
        return completed;
    }

    public void setCompleted(List<Job> completed) {
        this.completed = completed;
    }

    public List<Job> getIn_progress() {
        return in_progress;
    }

    public void setIn_progress(List<Job> in_progress) {
        this.in_progress = in_progress;
    }

    public Double getPot() {
        return pot;
    }

    public void setPot(Double pot) {
        this.pot = pot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Contractor> getContractors() {
        return contractors;
    }

    public void setContractors(List<Contractor> contractors) {
        this.contractors = contractors;
    }
}
