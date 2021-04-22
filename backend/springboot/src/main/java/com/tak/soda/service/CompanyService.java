package com.tak.soda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tak.soda.model.Company;
import com.tak.soda.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public boolean newCompany(Company company) {
		companyRepository.save(company);
		
		return true;
	}
	
	
}