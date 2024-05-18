package com.example.project.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.Student.Model.Students;
import com.example.project.Student.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/all")
	public List<Students> findAll(){
		return service.findAll();
	}
	@PostMapping("/addstudent")
	public Students addStudents( @RequestBody Students student) {
		return service.addStudents(student);
	}
	
	@GetMapping("/searchstudent/{studentid}")
	public Students searchStudents( @PathVariable int studentid) {
		return service.searchStudents(studentid);
		
	}
	
	@PutMapping("/updatestudent")
	public Students updateStudents(@RequestBody Students student) {
		return service.updateStudents(student);
		
	}
	
	@DeleteMapping("/deletestudent/{studentid}")
	public void deleteStudents(@PathVariable int studentid) {
		service.deleteStudents(studentid);
		
	}

}
