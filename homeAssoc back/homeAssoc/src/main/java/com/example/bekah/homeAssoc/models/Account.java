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
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Transaction> transactions;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Job>proposed;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Job>accepted;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Job>rejected;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Job>completed;

    @JsonIgnoreProperties({"account"})
    @OneToMany(mappedBy="account", cascade=CascadeType.ALL)
    private List<Job>in_progress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="building_id", referencedColumnName = "id")
    private Building building;

    @Column(name="pot")
    private Float pot;

    public Account(Long id, Building building, Float pot) {
        this.id = id;
        this.transactions = new ArrayList<Transaction>();
        this.proposed = new ArrayList<Job>();
        this.accepted = new ArrayList<Job>();
        this.rejected = new ArrayList<Job>();
        this.completed = new ArrayList<Job>();
        this.in_progress = new ArrayList<Job>();
        this.building = building;
        this.pot = pot;
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

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Float getPot() {
        return pot;
    }

    public void setPot(Float pot) {
        this.pot = pot;
    }
}
