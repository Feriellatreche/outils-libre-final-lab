package com.example;

public class Main {
    public static void main(String[] args) {
        PricingEngine engine = new PricingEngine();
        
        // Clean code test with enums
        double result = engine.calculate(
            100,                    // price
            2,                      // quantity  
            CustomerType.VIP,       // customer type
            DiscountCode.SAVE10     // discount code
        );
        
        System.out.printf("Final Price: $%.2f%n", result);
        System.out.println("Expected: $178.50 ✅");
    }
}