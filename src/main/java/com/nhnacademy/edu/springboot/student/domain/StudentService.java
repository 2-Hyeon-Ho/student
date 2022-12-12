package com.nhnacademy.edu.springboot.student.domain;

import com.nhnacademy.edu.springboot.student.model.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudents();
    Student getStudent(Long id);
    Student createStudent(Student student);
    void deleteStudent(Long id);
}
