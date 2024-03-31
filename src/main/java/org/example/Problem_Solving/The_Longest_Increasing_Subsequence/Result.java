package org.example.Problem_Solving.The_Longest_Increasing_Subsequence;

import java.util.*;

public class Result {
    public static int longestIncreasingSubsequence(List<Integer> arr) {
        List<Integer> lis = new ArrayList<>();
        lis.add(arr.get(0));

        for (int i=1; i<arr.size(); i++) {
            int num = arr.get(i);
            if (num > lis.get(lis.size()-1)) {
                lis.add(num);
            } else {
                int index = binarySearch(lis, num);
                lis.set(index, num);
            }
        }

        return lis.size();
    }

    private static int binarySearch(List<Integer> lis, int target) {
        int left = 0;
        int right = lis.size()-1;

        while (left<right) {
            int mid = left+(right-left)/2;
            if (lis.get(mid)<target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
