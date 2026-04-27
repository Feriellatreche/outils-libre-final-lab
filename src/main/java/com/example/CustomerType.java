package com.example;

public enum CustomerType {
    REGULAR(1.0),
    VIP(0.8);
    
    private final double discountMultiplier;
    
    CustomerType(double discountMultiplier) {
        this.discountMultiplier = discountMultiplier;
    }
    
    public double getDiscountMultiplier() {
        return discountMultiplier;
    }
}