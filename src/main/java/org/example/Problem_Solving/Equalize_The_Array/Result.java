package org.example.Problem_Solving.Equalize_The_Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> num = new HashMap<>();
        for (Integer i: arr) {
            num.put(i, num.getOrDefault(i, 0)+1);
        }
        int maxNum = 0;
        for (Integer i: num.values()) {
            maxNum = Math.max(maxNum, i);
        }

        return arr.size()-maxNum;
    }
}
