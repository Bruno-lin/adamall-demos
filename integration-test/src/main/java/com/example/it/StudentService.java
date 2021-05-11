package com.example.it;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.stream.Stream;

@Service
public class StudentService {
    final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getOldestStudent() {
        return Stream.of(studentMapper.selectAllStudents()).max(Comparator.comparingInt(student -> student.age)).orElse(null);
    }
}
