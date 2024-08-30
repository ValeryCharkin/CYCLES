package ru.netology.javaqa.javamvn.services.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.netology.javaqa.javamvn.services.VacantionCount;


public class VacantionCountTest {
    @Test
    public void VacantionCount1() {
        VacantionCount service = new VacantionCount();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void VacantionCount2() {
        VacantionCount service = new VacantionCount();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(actual, expected);
    }
}







