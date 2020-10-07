package com.company;
import java.util.Scanner;
//2 Вариант
//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class Month_2 {
    public static void main(String[] args) {
        String [] month  = new String[]
                {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};
        Scanner num_month = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int num = num_month.nextInt();
        String error = "Enter the month number to 1 to 12!";
        if (num <= 0){
            System.out.print(error);
        } else if (num >= 13){
            System.out.print(error);
        } else {
            System.out.print(month[num-1]);
        }
    }
}
