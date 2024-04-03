package org.example.Problem_Solving.Simple_Array_Sum;

import java.util.List;

public class Result {
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer integer : ar) sum += integer;
        return sum;
    }

}