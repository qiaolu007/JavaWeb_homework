package com.itheima;

import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
public class SpringBootMybatisApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testFindAll() {
        List<Student> students = studentMapper.findAll();
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void testInsertStudent() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Student student = new Student(null, "中介费", "2015112", 1, "13800000910", "111181111111111111", 4, LocalDate.parse("2019-01-05"),
                LocalDateTime.parse("2025-03-07 21:11:56", formatter),
                LocalDateTime.parse("2025-03-07 21:11:56", formatter));

        int res = studentMapper.insertStudent(student);
        System.out.println("插入:" + res + "数据");
    }

    @Test
    public void testUpdateStudent() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Student student = new Student(14, "中介费", "1115112", 1, "13800008888", "222281111111111111", 4, LocalDate.parse("2019-01-05"),
                LocalDateTime.parse("2025-03-07 21:11:56", formatter),
                LocalDateTime.parse("2025-03-07 21:11:56", formatter));

        int res = studentMapper.updateStudent(student);
        System.out.println("更新:" + res + "数据");
    }

    @Test
    public void testDeleteStudent() {
        Integer id = 14;
        System.out.println(studentMapper.deleteStudent(id));
    }
}
