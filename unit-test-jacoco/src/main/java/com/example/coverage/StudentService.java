package com.example.coverage;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.stream.Stream;

@Service
public class StudentService {
    final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getOldestStudent() {
        return Stream.of(studentDao.getAllStudents()).max(Comparator.comparingInt(student -> student.age)).orElse(null);
    }
    public Student getYoungestStudent() {
        return Stream.of(studentDao.getAllStudents()).min(Comparator.comparingInt(student -> student.age)).orElse(null);
    }
}
