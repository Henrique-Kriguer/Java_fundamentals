package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("A :");
        a = sc.nextInt();
        System.out.print("B :");
        b = sc.nextInt();
        c = a + b;
        System.out.print("A + B  : "+ c);
        sc.close();
    }
}