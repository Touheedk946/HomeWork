package Hometask_Comparator_02;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        // Compare by score descending, then by name ascending
        if (p1.getScore() != p2.getScore()) {
            return Integer.compare(p2.getScore(), p1.getScore());
        }
        return p1.getName().compareTo(p2.getName());
    }
}
