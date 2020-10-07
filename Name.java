package com.company;
import java.util.Scanner;
//1.Приветствовать любого пользователя при вводе его имени через командную строку.
public class Name {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String w = name.nextLine();
        System.out.print("Hello: " + w);
        }
    }
