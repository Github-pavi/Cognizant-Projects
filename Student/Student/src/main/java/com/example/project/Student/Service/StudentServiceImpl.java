package com.example.project.Student.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.Student.Dao.StudentDao;
import com.example.project.Student.Model.Students;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Students addStudents(Students student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public Students searchStudents(int studentid) {
		// TODO Auto-generated method stub
		return dao.findById(studentid).get();
	}

	@Override
	public Students updateStudents(Students student) {
		// TODO Auto-generated method stub	
		return dao.save(student);
	}
	
	

	@Override
	public  void  deleteStudents(int studentid) {
		// TODO Auto-generated method stub
		dao.deleteById(studentid);
	}

}
