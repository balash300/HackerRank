package org.example.Java_.Java_Loops_II;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i=1;i<=t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) *b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
