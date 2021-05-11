package com.example.coverage;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    /**
     * 此方法模拟从数据库中读取所有学生的数据
     * @return 所有学生
     */
    public Student[] getAllStudents() {
        return new Student[]{
                new Student("Alice", 18),
                new Student("Bob", 20),
                new Student("Chris", 30)
        };
    }
}
