package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item != null) {
                double itemPrice = item.getAmount() * item.getPrice();
                total = total + itemPrice;
            }
        }
        return total;
    }
    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item != null) {
                double itemPrice = item.getAmount() * item.getPrice();
                double discount = item.getDiscount() / 100;
                total = total + itemPrice * (1 - discount);
            }
        }
        return total;
    }
    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item != null && item.isVegetarian()) {
                double itemPrice = item.getAmount() * item.getPrice();
                total = total + itemPrice;
            }
        }
        return total;
    }
}