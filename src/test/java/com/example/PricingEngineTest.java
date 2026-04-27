package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PricingEngineTest {
    
    private final PricingEngine engine = new PricingEngine();
    
    @Test
    void testRegularNoDiscount() {
        assertEquals(119.0, engine.calculate(100, 1, CustomerType.REGULAR, DiscountCode.NONE), 0.01);
    }
    
    @Test
    void testVIPDiscount() {
        assertEquals(95.2, engine.calculate(100, 1, CustomerType.VIP, DiscountCode.NONE), 0.01);
    }
    
    @Test
    void testSave10() {
        assertEquals(107.1, engine.calculate(100, 1, CustomerType.REGULAR, DiscountCode.SAVE10), 0.01);
    }
    
    @Test
    void testVIPSave10() {
        assertEquals(178.5, engine.calculate(100, 2, CustomerType.VIP, DiscountCode.SAVE10), 0.01);
    }
}