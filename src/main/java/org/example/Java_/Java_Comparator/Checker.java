package org.example.Java_.Java_Comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int scoreComparison = Integer.compare(b.score, a.score);
        if (scoreComparison != 0) {
            return scoreComparison;
        }

        int nameComparison = a.name.compareTo(b.name);
        return nameComparison;
    }
}
