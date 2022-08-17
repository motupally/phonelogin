package com.example.loginform.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tatastrivemodel")
public class tatastrivemodel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String orgName;
	private String studentId;
	private String mailId;
	private String certificateverf;
	
	public tatastrivemodel(String string, String string2, String string3, String string4)
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getVerfCode() {
		return certificateverf;
	}
	public void setVerfCode(String verfCode) {
		this.certificateverf = verfCode;
	}
    
}
