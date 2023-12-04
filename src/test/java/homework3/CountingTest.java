package homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    private int number;
    private Counting counting;
    @BeforeEach
    void setUp() {
        counting = new Counting();
    }

    @Test
    void evenOddNumber() {
        assertTrue(counting.evenOddNumber(12));
        assertTrue(counting.evenOddNumber(-12));
        assertFalse(counting.evenOddNumber(1));
        assertFalse(counting.evenOddNumber(-1));
    }

    @Test
    void numberInInterval() {
        assertTrue(counting.numberInInterval(27));
        assertFalse(counting.numberInInterval(2));
    }
}