package com.example.bekah.homeAssoc.repositories;

import com.example.bekah.homeAssoc.models.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractorRepo extends JpaRepository<Contractor, Long> {
}
