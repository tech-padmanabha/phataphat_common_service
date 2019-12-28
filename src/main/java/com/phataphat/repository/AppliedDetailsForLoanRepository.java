package com.phataphat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phataphat.model.AppliedDetailsForLoan;

@Repository
public interface AppliedDetailsForLoanRepository extends JpaRepository<AppliedDetailsForLoan, String>{
	
}
