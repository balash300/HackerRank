package org.example.Java_.Java_End_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1;
        while (sc.hasNext()) {
            String word = sc.nextLine();
            System.out.println(i + " " + word);
            i++;
        }
    }
}
