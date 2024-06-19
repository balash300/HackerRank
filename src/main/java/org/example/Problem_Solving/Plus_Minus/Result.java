package org.example.Problem_Solving.Plus_Minus;

import java.util.List;

public class Result {
    public static void plusMinus(List<Integer> arr) {
        int arrSize = arr.size();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zero = 0;

        for (int i=0; i<arrSize; i++) {
            if (arr.get(i)>0) positiveNumbers++;
            else if (arr.get(i)<0) negativeNumbers++;
            else zero++;
        }

        System.out.println((double) positiveNumbers/arrSize);
        System.out.println((double) negativeNumbers/arrSize);
        System.out.println((double) zero/arrSize);
    }
}
