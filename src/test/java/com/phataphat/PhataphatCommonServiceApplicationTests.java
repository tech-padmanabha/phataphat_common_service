package com.phataphat;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.phataphat.model.Address;
import com.phataphat.model.AppliedDetailsForLoan;
import com.phataphat.model.CustomerDetails;
import com.phataphat.repository.AddressRepository;
import com.phataphat.repository.AppliedDetailsForLoanRepository;
import com.phataphat.repository.CustomerDetailsRepository;

@SpringBootTest
class PhataphatCommonServiceApplicationTests {
	@Autowired
	CustomerDetailsRepository customer;
	@Autowired
	AddressRepository addr;
	@Autowired
	AppliedDetailsForLoanRepository applRepo;
	//@Test
	void contextLoads() {
		CustomerDetails cd = new CustomerDetails();
		cd.setAge("21");
		cd.setAlternateContactNo("99393");
		cd.setContactNo("39393");
		//cd.setCustomerId("cusId");
		cd.setCustomerName("Pad");
		cd.setDob(LocalDate.now());
		cd.setEmailId("xyz@mail");
		cd.setGender("m");
		customer.save(cd);
	}
	//@Test
	void TestAddr() {
		Address ad = new Address();
		ad.setAddressLine1("some");
		ad.setAddressLine2("some2");
		ad.setAddressLine3("some3");
		ad.setCity("mum");
		ad.setCustomerId("someId");
		ad.setDist("mh");
		ad.setPinCode(761111l);
		ad.setState("Maharashtra");
		addr.save(ad);
	}
	@Test
	void TestApplid() {
		AppliedDetailsForLoan adl = new AppliedDetailsForLoan();
		adl.setApplName("Birash");
		adl.setCreatedBy("Phataphat");
		adl.setUpdatedBy("harish");
		//adl.setUpdatedAt(LocalDateTime.now());
		applRepo.save(adl);
	}

}
