package com.example.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * 编写单元测试时一般选择不启动Spring容器，运行速度会快很多
 */
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    /**
     * 生成一个mock（模拟）对象，可以随意控制其行为
     */
    @Mock
    StudentDao studentDaoMock;

    /**
     * 将mock对象注入到studentService中
     */
    @InjectMocks
    StudentService studentService;

    /**
     * 本测试用例主要目的是测试StudentService::getOldestStudent方法实现的是否正确。getOldestStudent依赖于studentDao，为
     * 了使测试不受studentDao是否正常工作的影响，利用mock来模拟studentDao的行为。
     */
    @Test
    public void testGetOldestStudent() {
        // 设定studentDaoMock对象的行为
        when(studentDaoMock.getAllStudents()).thenReturn(new Student[]{new Student("David", 15), new Student("Eric", 16)});

        // 设定好之后，调用getOldestStudent方法。方法执行时，内部调用studentDao.getAllStudents()会返回刚刚设定的内容
        Student stu = studentService.getOldestStudent();

        assertEquals("Eric", stu.name);
        assertEquals(16, stu.age);
    }

    /**
     * 这是一个会失败的测试用例
     */
    @Test
    public void testFailure() {
        when(studentDaoMock.getAllStudents()).thenReturn(new Student[]{new Student("Fiona", 33)});
        Student stu = studentService.getOldestStudent();
        assertEquals("George", stu.name);
        assertEquals(20, stu.age);
    }
}