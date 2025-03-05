package com.qiaolu;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmpServiceTest {

    public EmpService empService = new EmpService();
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110101199001011234", "510310198812120931"})
    void isBeijing(String id) {
        System.out.println(empService.isBeijing(id));
    }

    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110101199001011234", "510310198812120931"})
    void getAge(String id) {
        System.out.println(empService.getAge(id));
    }

    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110101199001011234", "510310198812120931"})
    void getGender(String id) {
        System.out.println(empService.getGender(id));
    }

    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110101199001011234", "510310198812120931"})
    void getYear(String id) {
        System.out.println(empService.getYear(id));
    }

    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110101199001011234", "510310198812120931"})
    void getMonth(String id) {
        System.out.println(empService.getMonth(id));
    }
}