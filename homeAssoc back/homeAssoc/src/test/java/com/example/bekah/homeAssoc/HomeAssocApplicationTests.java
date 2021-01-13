package com.example.bekah.homeAssoc;

import com.example.bekah.homeAssoc.repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomeAssocApplicationTests {

	@Autowired
	AccountRepo accountRepo;

	@Autowired
	ContractorRepo contractorRepo;

	@Autowired
	FlatRepo flatRepo;

	@Autowired
	JobRepo jobRepo;

	@Autowired
	TransactionRepo transactionRepo;

	@Autowired
	UserRepo userRepo;

	@Test
	void contextLoads() {
	}


}
