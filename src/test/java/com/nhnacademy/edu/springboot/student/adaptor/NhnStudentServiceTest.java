package com.nhnacademy.edu.springboot.student.adaptor;

import com.nhnacademy.edu.springboot.student.domain.StudentService;
import com.nhnacademy.edu.springboot.student.model.Student;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NhnStudentServiceTest {
    @Autowired
    StudentService studentService;

    @Test
    void getStudents() {
        //when
        List<Student> students = studentService.getStudents();

        //then
        assertThat(students).hasSize(2);
    }
}