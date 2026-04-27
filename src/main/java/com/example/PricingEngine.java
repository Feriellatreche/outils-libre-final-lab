package com.example;

public class PricingEngine {
    private final DiscountEngine discountEngine = new DiscountEngine();
    private final TaxCalculator taxCalculator = new TaxCalculator();
    
    public double calculate(double price, int quantity, String customerType, String discountCode) {
        // Subtotal
        double subtotal = price * quantity;
        
        // Apply discounts
        double discounted = discountEngine.applyCustomerDiscount(subtotal, customerType);
        discounted = discountEngine.applyDiscountCode(discounted, discountCode);
        
        // Apply tax
        return taxCalculator.applyTax(discounted);
    }
}