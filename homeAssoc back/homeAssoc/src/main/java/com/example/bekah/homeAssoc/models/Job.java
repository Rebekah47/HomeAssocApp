package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @JsonIgnoreProperties({"jobs"})
    @ManyToOne
    @JoinColumn(name="flat_id", nullable = false)
    private Flat flat;

    @Column(name="approved")
    private Boolean approved;

    @Column(name="cost")
    private Double cost;

    @Column(name="location")
    private String location;

    @JsonIgnoreProperties({"job"})
    @OneToMany(mappedBy="transaction", cascade=CascadeType.ALL)
    private List<Transaction> transactions;


    public Job(String name, String description, Flat flat, Boolean approved, Double cost, String location) {
        this.name = name;
        this.description = description;
        this.flat = flat;
        this.approved = approved;
        this.cost = cost;
        this.location = location;
        this.transactions = new ArrayList<Transaction>();
    }

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
