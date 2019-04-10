package com.ssi;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
@NotEmpty	
@Length(max=7)
//@Pattern(regexp="[^0-9]*")
//@Pattern(regexp=".o\\.o.y") //Go.oxy
//@Pattern(regexp="^in.y$")//inxy (in in begining and y at end and one char in between
//@Pattern(regexp="[a-zA-Z]*")//only alphbates
@Pattern(regexp="\\d{5}")//only five digits
private String studentName;
@Size(min=3,max=8)
private String studentHobby;
@Min(100) @Max(400)
private long studentMobile;
//@Future
@Past
private Date studentDOB;
@Email
private String studentEmail;
@NotEmpty
private ArrayList<String> studentSkills;

private Address studentAddress=new Address();
public Student(String studentName, String studentHobby, Long studentMobile,
		Date studentDOB, String studentEmail, ArrayList<String> studentSkills,
		Address studentAddress) {
	super();
	this.studentName = studentName;
	this.studentHobby = studentHobby;
	this.studentMobile = studentMobile;
	this.studentDOB = studentDOB;
	this.studentEmail = studentEmail;
	this.studentSkills = studentSkills;
	this.studentAddress = studentAddress;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}

public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentHobby() {
	return studentHobby;
}
public void setStudentHobby(String studentHobby) {
	this.studentHobby = studentHobby;
}
public long getStudentMobile() {
	return studentMobile;
}
public void setStudentMobile(long studentMobile) {
	this.studentMobile = studentMobile;
}
public Date getStudentDOB() {
	return studentDOB;
}
public void setStudentDOB(Date studentDOB) {
	this.studentDOB = studentDOB;
}
public ArrayList<String> getStudentSkills() {
	return studentSkills;
}
public void setStudentSkills(ArrayList<String> studentSkills) {
	this.studentSkills = studentSkills;
}
public Address getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(Address studentAddress) {
	this.studentAddress = studentAddress;
}

public Student() {
	super();
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentHobby="
			+ studentHobby + ", studentMobile=" + studentMobile
			+ ", studentDOB=" + studentDOB + ", studentEmail=" + studentEmail
			+ ", studentSkills=" + studentSkills + ", studentAddress="
			+ studentAddress + "]";
}


}
