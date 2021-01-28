package com.academy.datatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myTest = scanner.nextLine();
        String a = "My name is Test";
        String newString = a.replace("Test", myTest);
        System.out.println(newString);

        String b = "My name is Petko";
        System.out.println(newString.equals(b));

        System.out.println(b.length());


        String[] words = b.split(" ");
        System.out.println(words.length);


        String name = "Petko";
        int age = 31;
        System.out.printf("%s is %d years old", name, age);


    }
}
