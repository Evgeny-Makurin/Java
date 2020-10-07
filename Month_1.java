package com.company;
import java.util.Scanner;
//1 Вариант
//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class Month_1 {
    static public void main (String[] args){
        Scanner num_month = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int num = num_month.nextInt();

        String error = "Enter the month number to 1 to 12!";
        if (num<=0){
            System.out.print(error);
        } else if (num>=13) {
            System.out.print(error);
        } switch (num){
            case (1):
                System.out.print("January");
                break;
            case (2):
                System.out.print("February");
                break;
            case (3):
                System.out.print("March");
                break;
            case (4):
                System.out.print("April");
                break;
            case (5):
                System.out.print("May");
                break;
            case (6):
                System.out.print("June");
                break;
            case (7):
                System.out.print("July");
                break;
            case (8):
                System.out.print("August");
                break;
            case (9):
                System.out.print("September");
                break;
            case (10):
                System.out.print("October");
                break;
            case (11):
                System.out.print("November");
                break;
            case (12):
                System.out.print("December");
                break;
            }
    }
}
