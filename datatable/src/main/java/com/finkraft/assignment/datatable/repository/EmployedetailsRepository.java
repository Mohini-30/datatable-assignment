package com.finkraft.assignment.datatable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finkraft.assignment.datatable.model.EmployeeDetailsModel;


@Repository
public interface EmployedetailsRepository extends JpaRepository<EmployeeDetailsModel,Integer> {

	
	public List<EmployeeDetailsModel> findAll();
	
	public List<EmployeeDetailsModel> findByOrderByName();
}
