package com.qiaolu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpServiceTest2 {
    public EmpService empService = new EmpService();

    @Test
    void isBeijing() {
        assertTrue(empService.isBeijing("110101199001011234"));
        assertFalse(empService.isBeijing("610110201909091231"));
        assertFalse(empService.isBeijing("510310198812120931"));
    }

    @Test
    void getAge() {
        assertEquals(5, empService.getAge("610110201909091231"));
        assertEquals(35, empService.getAge("110101199001011234"));
        assertEquals(36, empService.getAge("510310198812120931"));
    }

    @Test
    void getGender() {
        assertEquals("女", empService.getGender("610110201909091231"));
        assertEquals("男", empService.getGender("110101199001011234"));
        assertEquals("女", empService.getGender("510310198812120931"));
    }

    @Test
    void getYear() {
        assertEquals("2019", empService.getYear("610110201909091231"));
        assertEquals("1990", empService.getYear("110101199001011234"));
        assertEquals("1988", empService.getYear("510310198812120931"));
    }

    @Test
    void getMonth() {
        assertEquals("09", empService.getMonth("610110201909091231"));
        assertEquals("01", empService.getMonth("110101199001011234"));
        assertEquals("12", empService.getMonth("510310198812120931"));
    }
}