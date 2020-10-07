package com.company;
import java.util.Scanner;
//4.вести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class Mathematical_function {

    public static void main (String[] args){
        Scanner text = new Scanner(System.in);

        System.out.print("Enter number x: ");
        int x = text.nextInt();

        System.out.print("Enter number y: ");
        int y = text.nextInt();

        System.out.print("Enter operation +, -, *, /: ");
        String op = text.next();

        switch (op){
            case "+":
                int res1 = x+y;
                System.out.println("Result = " + res1);
                break;
            case "-":
                int res2 = x-y;
                System.out.println("Result = " + res2);
                break;
            case "*":
                int res3 = x*y;
                System.out.println("Result = " + res3);
                break;
            case "/":
                int res4 = x/y;
                System.out.println("Result = " + res4);
                break;
        }
    }
}
