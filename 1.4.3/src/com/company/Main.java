package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        int i = in.nextInt();
        long number = (1 << i);
        a = a | number;
        System.out.println(a);
    }
}
