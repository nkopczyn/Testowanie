package pl.coderslab.refaktoryzacja;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void calculateTotalPrice() {
        Order order = new Order();
        List<Product> products = new ArrayList<>(
                Arrays.asList
                        (new Product("fish", 3.44),
                new Product("xxx", 44),
                                new Product("dd", 5)));

        double result = order.calculateTotalPrice(products);

        assertEquals(52.44, result);

    }
}