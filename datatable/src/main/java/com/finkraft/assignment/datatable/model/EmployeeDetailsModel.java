package com.finkraft.assignment.datatable.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Employee_Details")
public class EmployeeDetailsModel {
	
	@Id
	@Column(name="Id")
	@GenericGenerator(name = "Id",strategy = "increment")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "Id_seq")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "office")
	private String office;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "salary")
	private Long salary;
	
	@Column(name = "startDate")
	@DateTimeFormat
	private Date startDate;

	/**
	 * 
	 */
	public EmployeeDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param position
	 * @param office
	 * @param age
	 * @param salary
	 * @param startDate
	 */
	public EmployeeDetailsModel(int id, String name, String position, String office, int age, Long salary,
			Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.office = office;
		this.age = age;
		this.salary = salary;
		this.startDate = startDate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	

}
