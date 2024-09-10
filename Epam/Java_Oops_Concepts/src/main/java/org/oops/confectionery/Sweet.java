package org.oops.confectionery;

public class Sweet extends Confectionery {
    private String flavor;

    public Sweet(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
