package org.example.Problem_Solving.Compare_the_Triplets;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;

        for (int i=0; i<a.size(); i++) {
            if(a.get(i)>b.get(i)) num1++;
            if(a.get(i)<b.get(i)) num2++;
        }
        list.add(num1);
        list.add(num2);

        return list;
    }
}
