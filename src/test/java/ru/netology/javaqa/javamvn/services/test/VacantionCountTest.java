package ru.netology.javaqa.javamvn.services.test;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.javamvn.services.VacantionCount;


public class VacantionCountTest {
    //@Test
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/VacantionService.csv")
    public void VacantionCount(int income, int expenses, int threshold, int expected) {
        VacantionCount service = new VacantionCount();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, expected);

    }
}

//@Test
//public void VacantionCount2() {
//VacantionCount service = new VacantionCount();
//int expected = 2;
//int actual = service.calculate(100000, 60000, 150000);
//Assertions.assertEquals(actual, expected);
//}
//}







