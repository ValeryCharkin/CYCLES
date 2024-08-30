package ru.netology.javaqa.javamvn.services;

public class VacantionCount {
    public int calculate(int income, int expenses, int threshold) {

        int balance = 0;
        int VacantionCount = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance -= expenses;
                balance /= 3;
                VacantionCount++;
            } else {
                balance += income;
                balance -= expenses;


            }

        }
        return VacantionCount;
    }


}
