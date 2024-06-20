package org.example.Problem_Solving.Mini_Max_Sum;

import java.util.List;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long[] sums = new long[arr.size()];
        long sum = 0;

        for (int i=0; i<arr.size(); i++) sum += arr.get(i);
        for (int i=0; i<arr.size(); i++) sums[i] = sum - arr.get(i);

        long max = sums[0];
        long min = sums[0];

        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > max) max = sums[i];
            if (sums[i] < min) min = sums[i];
        }
        System.out.println(min + " " + max);
    }
}
