package com.example.bekah.homeAssoc.repositories;


import com.example.bekah.homeAssoc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
