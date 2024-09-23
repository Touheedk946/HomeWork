package Hometask_Comparator_02;

class Player {
    private String name;
    private int score;

    // Constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}