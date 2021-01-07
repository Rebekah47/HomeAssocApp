package com.example.bekah.homeAssoc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private Float amount;

    @Column(name="date")
    private LocalDate date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="job_id", referencedColumnName = "id")
    private Job job;


}
