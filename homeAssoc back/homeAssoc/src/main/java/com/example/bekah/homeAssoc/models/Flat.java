package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="flats")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @JsonIgnoreProperties({"flats"})
    @OneToMany(mappedBy = "flat", cascade = CascadeType.ALL)
    private List<User> users;

    @Column(name="occupied_status")
    private Boolean occupied_status;

}
