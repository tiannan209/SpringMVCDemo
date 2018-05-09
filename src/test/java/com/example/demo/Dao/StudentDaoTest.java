package com.example.demo.Dao;

import com.example.demo.Entity.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDaoTest {
    StudentDao sdao = new StudentDao();

    @Test
    public void getAllStudents() {
        assertEquals(sdao.getAllStudents().size(), 3);
    }

    @Test
    public void getStudentById() {
        Student s  =  sdao.getStudentById(1);
        assertEquals(s.getName(), "Tian Nan");
        assertEquals(s.getId(), 1);
        assertEquals(s.getCourse(),"Computer Science");
    }
}