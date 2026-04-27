package com.example;

public class Main {
    public static void main(String[] args) {
        PricingEngine engine = new PricingEngine();
        
        // Test case: 100$ x 2, VIP, SAVE10
        double result = engine.calculate(100, 2, "VIP", "SAVE10");
        System.out.printf("Final Price: $%.2f%n", result);
        // Expected: 178.50
    }
}