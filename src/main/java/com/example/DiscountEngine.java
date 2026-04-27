package com.example;

public class DiscountEngine {
    
    public double applyCustomerDiscount(double subtotal, CustomerType customerType) {
        return subtotal * customerType.getDiscountMultiplier();
    }
    
    public double applyDiscountCode(double subtotal, DiscountCode discountCode) {
        return subtotal - discountCode.getDiscountAmount();
    }
}