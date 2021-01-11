package com.example.bekah.homeAssoc.repositories;

import com.example.bekah.homeAssoc.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
}
