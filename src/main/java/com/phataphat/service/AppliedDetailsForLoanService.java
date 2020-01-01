package com.phataphat.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.phataphat.dto.AppliedDetailsForLoanDTO;
import com.phataphat.model.AppliedDetailsForLoan;
import com.phataphat.repository.AppliedDetailsForLoanRepository;
import com.phataphat.utils.ConversionUtils;

@Service
public class AppliedDetailsForLoanService {
	@Autowired
	private AppliedDetailsForLoanRepository applRepo;
	@Autowired
	private ModelMapper modelMapper;

	public List<AppliedDetailsForLoanDTO> getDetails() {
		List<AppliedDetailsForLoan> findAll = applRepo.findAll();
		List<AppliedDetailsForLoanDTO> applDetDto = ConversionUtils.convertToDTOs(findAll,
				AppliedDetailsForLoanDTO.class, modelMapper);
		return applDetDto;
	}

	public Page<AppliedDetailsForLoanDTO> getPageById(int page,int size,String shortBy){
		Pageable pageable = PageRequest.of(page, size,Sort.by(shortBy));
		Page<AppliedDetailsForLoan> findAll = applRepo.findAll(pageable);
		Page<AppliedDetailsForLoanDTO> convertToDTOPage = ConversionUtils.convertToDTOPage(findAll, AppliedDetailsForLoanDTO.class, modelMapper);
		return convertToDTOPage;
	}
}
