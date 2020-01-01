package com.phataphat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phataphat.dto.AppliedDetailsForLoanDTO;
import com.phataphat.service.AppliedDetailsForLoanService;
import com.phataphat.utils.ApiResponse;

@RestController
public class TestController {
	@Autowired
	private AppliedDetailsForLoanService customerDetailsService;
	
	@GetMapping(value = "/api/hi")
	public ApiResponse getWelcomeMessage(@RequestParam String enterName) {
		return new ApiResponse(HttpStatus.CREATED+"", "Welcome "+enterName);
	}
	@GetMapping(value = "/api/get")
	public ApiResponse getAppInfo() {
		List<AppliedDetailsForLoanDTO> details = customerDetailsService.getDetails();
		return new ApiResponse(HttpStatus.ACCEPTED+"","getted All Informations",details);
	}
	@GetMapping(value = "/api/get-all")
	public Page<AppliedDetailsForLoanDTO> getAppInfoByPage(@RequestParam int page,@RequestParam int size,@RequestParam String shortBy) {
		Page<AppliedDetailsForLoanDTO> pageById = customerDetailsService.getPageById(page, size, shortBy);
		return pageById;
	}
}
