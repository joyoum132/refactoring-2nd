package com.example.practice._20_large_class._41_extract_superclass;

import java.util.List;

public class Department extends Party{

    private List<Employee> staff;

    public List<Employee> getStaff() {
        return staff;
    }

    public int headCount() {
        return this.staff.size();
    }

    @Override
    double monthlyCost() {
        return staff.stream().mapToDouble(Employee::monthlyCost).sum();
    }
}
