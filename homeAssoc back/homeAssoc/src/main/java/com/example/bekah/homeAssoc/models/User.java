package com.example.bekah.homeAssoc.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnoreProperties({"users"})
    @ManyToOne
    @JoinColumn(name="flat-_id", nullable = false)
    private Flat flat;



}
