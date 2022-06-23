package UnitTests.AlmaTesztek;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AlmaTeszt {
    Alma apple = new Alma(150);

    @Test
    public void testBuyNoApples() {
        assertNotNull(this.apple.BuyApple(0));
    }

    @Test
    public void testBuyNegativeApples() {
        assertTrue(apple.BuyApple(-5) == 0);
    }

    @Test
    public void testBuyRandomApples() {
        Random rng = new Random();
        assertNotNull(this.apple.BuyApple(rng.nextInt()));
    }

    @Test
    public void testDiscount() {
        assertTrue(this.apple.BuyApple(99) != this.apple.BuyApple(100) - this.apple.getPrice());
    }
}
