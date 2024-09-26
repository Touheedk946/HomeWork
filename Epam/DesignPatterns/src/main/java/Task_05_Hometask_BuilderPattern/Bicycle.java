package Task_05_Hometask_BuilderPattern;

public class Bicycle {
    // Required attributes
    private final String frameSize;
    private final String color;

    // Optional attributes
    private final boolean hasGears;
    private final boolean hasDoubleStand;
    private final boolean hasDoubleSeat;
    private final boolean hasCarrier;

    // Private constructor to be called by the Builder
    private Bicycle(Builder builder) {
        this.frameSize = builder.frameSize;
        this.color = builder.color;
        this.hasGears = builder.hasGears;
        this.hasDoubleStand = builder.hasDoubleStand;
        this.hasDoubleSeat = builder.hasDoubleSeat;
        this.hasCarrier = builder.hasCarrier;
    }

    // Getters
    public String getFrameSize() {
        return frameSize;
    }

    public String getColor() {
        return color;
    }

    public boolean hasGears() {
        return hasGears;
    }

    public boolean hasDoubleStand() {
        return hasDoubleStand;
    }

    public boolean hasDoubleSeat() {
        return hasDoubleSeat;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                "frameSize='" + frameSize + '\'' +
                ", color='" + color + '\'' +
                ", hasGears=" + hasGears +
                ", hasDoubleStand=" + hasDoubleStand +
                ", hasDoubleSeat=" + hasDoubleSeat +
                ", hasCarrier=" + hasCarrier +
                '}';
    }

    // Builder Class
    public static class Builder {
        // Required attributes
        private final String frameSize;
        private final String color;

        // Optional attributes - initialized to default values
        private boolean hasGears = false;
        private boolean hasDoubleStand = false;
        private boolean hasDoubleSeat = false;
        private boolean hasCarrier = false;

        // Constructor for Builder with required attributes
        public Builder(String frameSize, String color) {
            this.frameSize = frameSize;
            this.color = color;
        }

        // Setter methods for optional attributes
        public Builder withGears(boolean hasGears) {
            this.hasGears = hasGears;
            return this;
        }

        public Builder withDoubleStand(boolean hasDoubleStand) {
            this.hasDoubleStand = hasDoubleStand;
            return this;
        }

        public Builder withDoubleSeat(boolean hasDoubleSeat) {
            this.hasDoubleSeat = hasDoubleSeat;
            return this;
        }

        public Builder withCarrier(boolean hasCarrier) {
            this.hasCarrier = hasCarrier;
            return this;
        }

        // Build method to create a Bicycle object
        public Bicycle build() {
            return new Bicycle(this);
        }
    }
}







/*
The Builder Pattern is particularly useful for constructing complex objects step by step, where the creation process should be independent of the parts that make up the object. It allows us to produce different representations of an object using the same construction process. In this task, we will create a Bicycle class using the Builder Pattern, giving the customer the flexibility to choose features like gears, double stands, double seats, and a carrier.
 */