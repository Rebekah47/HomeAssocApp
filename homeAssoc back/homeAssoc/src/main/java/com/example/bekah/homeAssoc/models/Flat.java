package com.example.bekah.homeAssoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
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

    public Flat(Long id, String name, Boolean occupied_status) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<User>();
        this.occupied_status = occupied_status;
    }

    public Flat() {
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Boolean getOccupied_status() {
        return occupied_status;
    }

    public void setOccupied_status(Boolean occupied_status) {
        this.occupied_status = occupied_status;
    }
}
