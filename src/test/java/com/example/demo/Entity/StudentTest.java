package com.example.demo.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student sTest = new Student(1, "tian", "IT");

    @Test
    public void getId() {
        assertEquals(sTest.getId(), 1);
    }

    @Test
    public void setId() {
        sTest.setId(2);
        assertEquals(sTest.getId(), 2);
    }

    @Test
    public void getName() {
        assertEquals(sTest.getName(), "tian");
    }

    @Test
    public void setName() {
    }

    @Test
    public void getCourse() {
    }

    @Test
    public void setCourse() {
    }
}