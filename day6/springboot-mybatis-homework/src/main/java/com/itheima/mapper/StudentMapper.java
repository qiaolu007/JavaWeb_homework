package com.itheima.mapper;

import com.itheima.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentMapper {

//    @Select("select * from student")
    public List<Student> findAll();

    @Insert("insert into student (name, no, gender, phone, id_card, degree, graduation_date, create_time, update_time) " +
            "values (#{name}, #{no}, #{gender}, #{phone}, #{idCard}, #{degree}, #{graduationDate}, #{createTime}, #{updateTime}) ")
    public int insertStudent(Student student);

    @Update("update student set no = #{no}, phone = #{phone}, id_card = #{idCard} where id = #{id}")
    public int updateStudent(Student student);

    public int deleteStudent(Integer id);
}

