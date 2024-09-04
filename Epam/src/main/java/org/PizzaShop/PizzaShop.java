package org.PizzaShop;
public class PizzaShop {
    public static void main(String[] args) {
        // Create pizza bases
        Pizza standardBase = new Pizza("Standard", 100);
        Pizza softBase = new Pizza("Soft Base", 120);

        // Create toppings
        Topping tomato = new Topping("Tomato", 20);
        Topping corn = new Topping("Corn", 25);
        Topping mushrooms = new Topping("Mushrooms", 30);
        Topping onion = new Topping("Onions", 60);

        // Create a pizza with Soft base
        OrderPizza myPizza_SoftBase = new OrderPizza(softBase);
        myPizza_SoftBase.addTopping(mushrooms);

        // Create a pizza with standard base
        OrderPizza my_Standared_Pizza = new OrderPizza(standardBase);
        my_Standared_Pizza.addTopping(tomato);
        my_Standared_Pizza.addTopping(corn);
        my_Standared_Pizza.addTopping(onion);

        // Display the order details and total cost
        my_Standared_Pizza.displayOrder();
        myPizza_SoftBase.displayOrder();
    }
}