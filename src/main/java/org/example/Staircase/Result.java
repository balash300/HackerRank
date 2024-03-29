package org.example.Staircase;

public class Result {
    public static void staircase(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
