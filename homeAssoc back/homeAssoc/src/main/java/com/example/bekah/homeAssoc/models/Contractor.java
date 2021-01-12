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

    @JsonIgnoreProperties({"contractors"})
    @ManyToOne
    @JoinColumn(name="contractor_id", nullable = false)
    private List<Job> jobs;

    public Contractor(String name, String phoneNumber, String profession) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
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
