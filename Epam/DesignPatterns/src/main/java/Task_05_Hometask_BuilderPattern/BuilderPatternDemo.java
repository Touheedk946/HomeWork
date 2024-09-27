package Task_05_Hometask_BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Building a basic bicycle with default options
        Bicycle basicBicycle = new Bicycle.Builder("Medium", "Red")
                .build();
        System.out.println(basicBicycle);



        // Building a bicycle with some additional options
        Bicycle customBicycle = new Bicycle.Builder("Large", "Blue")
                .withGears(true)
                .withDoubleStand(true)
                .build();
        System.out.println(customBicycle);

        // Building a fully-loaded bicycle with all optional features
        Bicycle fullFeatureBicycle = new Bicycle.Builder("Small", "Green")
                .withGears(true)
                .withDoubleStand(true)
                .withDoubleSeat(true)
                .withCarrier(true)
                .build();
        System.out.println(fullFeatureBicycle);

        // Attempting to modify a built bicycle - won't affect the object
        Bicycle anotherBicycle = new Bicycle.Builder("Small", "Yellow")
                .withCarrier(true)
                .build();
        System.out.println(anotherBicycle);
    }
}



/*
Explanation
Bicycle Class:

Contains attributes for required fields (frameSize and color) and optional fields (hasGears, hasDoubleStand, hasDoubleSeat, hasCarrier).
The constructor is private and accepts a Builder object to initialize its fields.
Builder Class:

Nested within the Bicycle class.
The constructor accepts the required attributes.
Provides methods (withGears, withDoubleStand, withDoubleSeat, and withCarrier) to set optional attributes.
The build() method creates a Bicycle object using the Builder object.
BuilderPatternDemo Class:

Demonstrates how to create different types of Bicycle objects using the Builder pattern.
Shows various configurations like a basic bicycle, a bicycle with some options, and a fully loaded bicycle.
This approach ensures that once a Bicycle object is created, it cannot be changed, respecting the immutability principle. The Builder pattern provides a clear and flexible way to construct complex objects step-by-step, making it easy to add or skip options as needed.
 */
