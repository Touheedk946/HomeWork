package bouquet;
import java.util.ArrayList;
import java.util.List;
public class Bouquet {
    private List<Flower> flowers;
    public Bouquet() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }

    public void displayBouquet() {
        System.out.println("Bouquet contains:");
        for (Flower flower : flowers) {
            System.out.println("- " + flower.getName());
        }
        System.out.println("Total cost: $" + calculateTotalCost());
    }
}
