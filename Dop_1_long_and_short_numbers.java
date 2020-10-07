package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class Dop_1_long_and_short_numbers {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num_1, num_2, num_3;
        System.out.println("Enter numbers: ");
        num_1 = num.nextInt();
        num_2 = num.nextInt();
        num_3 = num.nextInt();

        int max = Math.max(Math.max(num_1, num_2), num_3);
        int min = Math.min(Math.min(num_1, num_2), num_3);

        System.out.print(num_1+" "+num_2+" "+num_3+
                "\nMaksimum number: "+max+
                "\nMinimum number: "+min+
                "\nMax_l: ");
    }

}
