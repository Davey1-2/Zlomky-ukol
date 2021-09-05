package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo: ");
        int input = sc.nextInt();
        int base = 1;
        float end = 0;
        for (int i = 1; i <= input; i++) {
            System.out.println(base + "/" + i + " => " + (float) base/i);

            end = end + (float) base/i;
        }
        System.out.println("Celkem => " + end);
    }
}
