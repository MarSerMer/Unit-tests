package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;
    private Product product;
    @BeforeEach
    void setUp() {
        cart = new Cart();
        product = new Product("Apple", 12.0, 5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addProduct() {
        cart.addProduct(product);
        assertEquals(1, cart.getProducts().size());
    }

    @Test
    void removeProduct() {
        cart.addProduct(product);
        cart.removeProduct(product);
        assertEquals(0, cart.getProducts().size());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(0, cart.calculateTotalPrice());
        cart.addProduct(product);
        assertEquals(60.0, cart.calculateTotalPrice(), 0.1);
    }

}