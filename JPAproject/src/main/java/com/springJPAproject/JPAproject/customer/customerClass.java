package com.springJPAproject.JPAproject.customer;

//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customerClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String cAddress;
	private int cIncome;
	private String cNumber;
	
	public customerClass() {
		super();
	}
	
	public customerClass(int cId, String cName, String cAddress, int cIncome, String cNumber) {
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.cIncome = cIncome;
		this.cNumber = cNumber;
	}
	
	

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public int getcIncome() {
		return cIncome;
	}

	public String getcNumber() {
		return cNumber;
	}

	
	
	public void setcId(int cId) {
		this.cId = cId;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public void setcIncome(int cIncome) {
		this.cIncome = cIncome;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
}
