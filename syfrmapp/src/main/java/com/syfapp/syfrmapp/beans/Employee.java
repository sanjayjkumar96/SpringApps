package com.syfapp.syfrmapp.beans;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId;
	
	@NotNull(message = "Cannot be Null")
	@Basic(optional=false)
	private String empName;
	
	@NotNull(message = "Cannot be Null")
	@Basic(optional=false)
	private String empSupervisor;
	
	@NotNull(message = "Cannot be Null")
	@Basic(optional=false)
	private String empPhoneNo;
	
	@NotNull(message = "Cannot be Null")
	@Basic(optional=false)
	private String empAddress;
	
	@NotNull(message = "Cannot be Null")
	@Basic(optional=false)
	private Long empSSOId;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSupervisor() {
		return empSupervisor;
	}

	public void setEmpSupervisor(String empSupervisor) {
		this.empSupervisor = empSupervisor;
	}

	public String getEmpPhoneNo() {
		return empPhoneNo;
	}

	public void setEmpPhoneNo(String empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Long getEmpSSOId() {
		return empSSOId;
	}

	public void setEmpSSOId(Long empSSOId) {
		this.empSSOId = empSSOId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSupervisor=" + empSupervisor
				+ ", empPhoneNo=" + empPhoneNo + ", empAddress=" + empAddress + ", empSSOId=" + empSSOId + "]";
	}
	
	
}
