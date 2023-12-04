package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.google.common.collect.Iterables.size;
import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Store store;
    @BeforeEach
    void setUp() {
        store = new Store();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addProductToInventory() {
        Product product = new Product("Apple", 12.0, 5);
        int sizeBefore = size(store.getInventory());
        store.addProductToInventory(product);
        int sizeAfter = size(store.getInventory());
        assertEquals(sizeBefore, sizeAfter - 1);
    }

    @Test
    void removeProductFromInventory() {
        Product product = new Product("Apple", 12.0, 5);
        store.addProductToInventory(product);
        int sizeBefore = size(store.getInventory());
        store.removeProductFromInventory(product);
        int sizeAfter = size(store.getInventory());
        assertEquals(sizeBefore, sizeAfter + 1);
    }

    @Test
    void findProductByName() {
        Product product = new Product("Apple", 12.0, 5);
        store.addProductToInventory(product);
        assertEquals(product, store.findProductByName(product.getName()));
    }

    @Test
    void createCart() {
        Cart cart = store.createCart();
        assertNotNull(cart);
    }
}