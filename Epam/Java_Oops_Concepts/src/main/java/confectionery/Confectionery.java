package confectionery;

abstract class Confectionery {
    private String name;
    private double weight;

    public Confectionery(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
