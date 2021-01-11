package com.example.bekah.homeAssoc.repositories;

import com.example.bekah.homeAssoc.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
