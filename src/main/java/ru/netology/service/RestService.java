package ru.netology.service;
public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаю
                money -= expenses;
                money /= 3;
                counter++;
            } else {


                // работаю
                money += income;
                money -= expenses;

            }

        }


        return money;
    } }