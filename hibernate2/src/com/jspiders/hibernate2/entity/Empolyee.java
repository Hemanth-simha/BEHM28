package com.jspiders.hibernate2.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Empolyee {
	
	@Id
	@Column(name = "empno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empno;
	
	@Column(name = "ename")
	private String ename;
	
	@Embedded
	private Address address;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Empolyee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}
}
