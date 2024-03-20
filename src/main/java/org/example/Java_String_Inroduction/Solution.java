package org.example.Java_String_Inroduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next(), B=sc.next();
        int value = A.compareTo(B);

        System.out.println(A.length() + B.length());
        if (value > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(
                A.substring(0,1).toUpperCase() +
                        A.substring(1).toLowerCase() +
                        " " +
                        B.substring(0,1).toUpperCase() +
                        B.substring(1).toLowerCase()
        );
    }
}
