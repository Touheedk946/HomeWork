package confectionery;

public class Chocolate extends Confectionery {
    private String type;

    public Chocolate(String name, double weight, String type) {
        super(name, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
