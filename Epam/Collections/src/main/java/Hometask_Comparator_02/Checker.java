package Hometask_Comparator_02;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (b.score != a.score) {
            return Integer.compare(b.score, a.score);
        }
        // If scores are equal, compare by name in alphabetical order
        return a.name.compareTo(b.name);
    }
}
