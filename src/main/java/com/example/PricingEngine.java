package com.example;

public class PricingEngine {
    private final DiscountEngine discountEngine = new DiscountEngine();
    private final TaxCalculator taxCalculator = new TaxCalculator();
    
    public double calculate(double price, int quantity, CustomerType customerType, DiscountCode discountCode) {
        double subtotal = price * quantity;
        
        double discounted = discountEngine.applyCustomerDiscount(subtotal, customerType);
        discounted = discountEngine.applyDiscountCode(discounted, discountCode);
        
        return taxCalculator.applyTax(discounted);
    }
}