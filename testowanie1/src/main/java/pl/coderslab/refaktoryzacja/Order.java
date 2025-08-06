package pl.coderslab.refaktoryzacja;

import java.util.List;

public class Order {

    public double calculateTotalPrice(List<Product> products) {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
