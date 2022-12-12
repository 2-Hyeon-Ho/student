package com.nhnacademy.edu.springboot.student.domain;

import com.nhnacademy.edu.springboot.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAll();
}
