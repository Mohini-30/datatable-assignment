package com.finkraft.assignment.datatable.service;

import java.util.List;

import com.finkraft.assignment.datatable.model.EmployeeDetailsModel;

public interface EmployedetailsServiceInteface {

	
	public List<EmployeeDetailsModel> getAll();
	
	public List<EmployeeDetailsModel> getAllByName();
	
}
