package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="contractors")
public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="profession")
    private String profession;

    @JsonIgnoreProperties({"contractor"})
    @OneToMany(mappedBy="contractor", cascade=CascadeType.ALL)
    private List<Job> jobs;

    @JsonIgnoreProperties({"contractors"})
    @ManyToOne
    @JoinColumn(name="account_id", nullable = false)
    private Account account;

    public Contractor(String name, String phoneNumber, String profession, Account account) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.account = account;
        this.jobs = new ArrayList<Job>();
    }

    public Contractor() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
