package com.example.project.Student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Students data")
public class Students {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int  Studentid;
	String  StudentName;
	String Department;
	int Rollno;
	
	public Students() {
		super();
		
	}

	public Students(int studentid, String studentName, String department, int rollno) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		Department = department;
		Rollno = rollno;
	}

	public int getStudentid() {
		return Studentid;
	}

	public void setStudentid(int studentid) {
		Studentid = studentid;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	@Override
	public String toString() {
		return "Students [Studentid=" + Studentid + ", StudentName=" + StudentName + ", Department=" + Department
				+ ", Rollno=" + Rollno + "]";
	}
	
	
	

}
