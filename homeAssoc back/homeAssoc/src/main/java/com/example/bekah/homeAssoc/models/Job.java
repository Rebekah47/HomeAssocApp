package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
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
    private Float cost;

    @Column(name="location")
    private String location;

    @JsonIgnoreProperties({"job"})
    @OneToMany(mappedBy="transaction", cascade=CascadeType.ALL)
    private List<Transaction> transactions;
}
