package com.finkraft.assignment.datatable.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finkraft.assignment.datatable.model.EmployeeDetailsModel;
import com.finkraft.assignment.datatable.service.EmployedetailsServiceInteface;

@RestController("employee")
@CrossOrigin(value ="*")
public class EmployeeDetailsController {
	
	
	@Autowired
	private EmployedetailsServiceInteface empService;
	
	
	@RequestMapping(path="/get-all", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDetailsModel>> getAll(){
		List<EmployeeDetailsModel> empList= empService.getAll();
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<EmployeeDetailsModel>> responseEntity = new ResponseEntity<>(empList,status);
		return responseEntity;			
	}
}
