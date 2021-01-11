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
    private Integer phoneNumber;

    @Column(name="profession")
    private String profession;

    @Column(name="rates")
    private Float rates;

    @JsonIgnoreProperties({"contractors"})
    @ManyToOne
    @JoinColumn(name="contractor_id", nullable = false)
    private List<Job> jobs;

    public Contractor(Long id, String name, Integer phoneNumber, String profession, Float rates) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.rates = rates;
        this.jobs = new ArrayList<Job>();
    }

    public Contractor() {
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

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Float getRates() {
        return rates;
    }

    public void setRates(Float rates) {
        this.rates = rates;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
