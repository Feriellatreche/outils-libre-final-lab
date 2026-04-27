package com.example;

public class Main {
    public static void main(String[] args) {
        PricingEngine engine = new PricingEngine();
        
        // Test SAVE10
        double save10 = engine.calculate(100, 1, "REGULAR", "SAVE10");
        System.out.println("SAVE10 actual = " + save10);
        
        // Expected calculation
        System.out.println("Expected: 100 - 10 + 19% tax = " + (90 * 1.19));
    }
}