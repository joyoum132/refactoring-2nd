package com.example.practice._20_large_class._41_extract_superclass;

public abstract class Party {
    protected String name;

    public String getName() {
        return name;
    }

    abstract double monthlyCost();

    public double annualCost() {
        return this.monthlyCost() * 12;
    }
}
