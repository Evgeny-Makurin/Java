package com.company;
//3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Ramdom_numbers {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            System.out.print(i +"\n-\n");
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(i + " ");
        }
    }
}