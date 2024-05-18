package com.example.project.Student.Service;

import java.util.List;

import com.example.project.Student.Model.Students;

public interface StudentService {
	
	public List<Students> findAll();
	public Students addStudents(Students student);
	public Students searchStudents(int studentid);
	public Students updateStudents(Students student);
	public void deleteStudents(int studentid);

	
}
