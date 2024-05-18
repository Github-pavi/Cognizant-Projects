package com.example.project.Student.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project.Student.Model.Students;


@Repository
public interface StudentDao extends JpaRepository<Students,Integer>{

}
