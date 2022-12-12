package com.nhnacademy.edu.springboot.student.domain;

import com.nhnacademy.edu.springboot.student.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void findAll() {
        //given
        Student student = new Student(1L, "lee", 90);
        studentRepository.save(student);

        //when
        Optional<Student> actual = studentRepository.findById(1L);

        //then
        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(student);
    }
}