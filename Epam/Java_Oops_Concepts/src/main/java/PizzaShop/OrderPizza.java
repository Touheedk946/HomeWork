package PizzaShop;

import java.util.ArrayList;
import java.util.List;

public class OrderPizza {
    private Pizza base;
    private List<Topping> toppings;

    public OrderPizza(Pizza base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateTotalCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost += totalCost + topping.getCost();
        }
        return totalCost;
    }

    public void displayOrder() {
        System.out.println("Pizza with " + base.getName() + " base:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getName());
        }
        System.out.println("Total cost: " + calculateTotalCost());
    }
}