package com.example.bekah.homeAssoc.repositories;


import com.example.bekah.homeAssoc.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job, Long> {
}
