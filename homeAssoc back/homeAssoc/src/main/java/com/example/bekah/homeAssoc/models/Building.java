package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @JsonIgnoreProperties({"building"})
    @OneToMany(mappedBy="building", cascade=CascadeType.ALL)
    private List<Flat> flats;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id", referencedColumnName = "id")
    private Account account;

    @JsonIgnoreProperties({"building"})
    @OneToMany(mappedBy="building", cascade=CascadeType.ALL)
    private List<Contractor> contractors;

    @JsonIgnoreProperties({"building"})
    @OneToMany(mappedBy="building", cascade=CascadeType.ALL)
    private List<Job> jobs;

    public Building(Long id, String name, String address, Account account,  List<Job> jobs) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.flats = new ArrayList<Flat>();
        this.account = account;
        this.contractors = new ArrayList<Contractor>();
        this.jobs = jobs;
    }

    public Building() {
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Contractor> getContractors() {
        return contractors;
    }

    public void setContractors(List<Contractor> contractors) {
        this.contractors = contractors;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
