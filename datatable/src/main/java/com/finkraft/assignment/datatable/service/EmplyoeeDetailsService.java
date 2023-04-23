package com.finkraft.assignment.datatable.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finkraft.assignment.datatable.model.EmployeeDetailsModel;
import com.finkraft.assignment.datatable.repository.EmployedetailsRepository;

@Service
public class EmplyoeeDetailsService implements EmployedetailsServiceInteface {
	
	@Autowired
	EmployedetailsRepository empRepo;
	
	@Override
	public List<EmployeeDetailsModel> getAll(){
		List<EmployeeDetailsModel> empList = empRepo.findAll();
		return empList;
	}
	
	@Override
	public List<EmployeeDetailsModel> getAllByName(){
		
		List<EmployeeDetailsModel> empList = empRepo.findAll();
		return empList;
	}

}
