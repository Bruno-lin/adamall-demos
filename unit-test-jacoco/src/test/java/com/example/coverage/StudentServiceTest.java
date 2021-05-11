package com.example.coverage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @Mock
    StudentDao studentDaoMock;

    @InjectMocks
    StudentService studentService;

    @Test
    public void testGetOldestStudent() {
        when(studentDaoMock.getAllStudents()).thenReturn(new Student[]{new Student("David", 15), new Student("Eric", 16)});
        Student stu = studentService.getOldestStudent();
        assertEquals("Eric", stu.name);
        assertEquals(16, stu.age);
    }

    /**
     * 删除注释，启用该测试，可以提高测试覆盖率
     */
//    @Test
//    public void testGetYoungestStudent() {
//        when(studentDaoMock.getAllStudents()).thenReturn(new Student[]{new Student("David", 15), new Student("Eric", 16)});
//        Student stu = studentService.getYoungestStudent();
//        assertEquals("David", stu.name);
//        assertEquals(15, stu.age);
//    }
}