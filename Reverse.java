package com.company;
import java.util.*;
//2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Reverse {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you text: ");
        String text = in.nextLine();
        StringBuffer rev = new StringBuffer(text).reverse();
        System.out.println("Enter you text: " + text);
        System.out.print("Reverse text: " + rev);
    }
}
