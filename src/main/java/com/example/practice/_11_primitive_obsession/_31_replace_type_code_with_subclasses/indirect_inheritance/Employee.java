package com.example.practice._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import java.util.List;

public class Employee {

    private String name;

    private EmployeeType type;

    public Employee(String name, String typeValue) {
        this.validate(typeValue);
        this.name = name;
        this.type = this.employeeType(typeValue);
                
    }

    private EmployeeType employeeType(String typeValue) {
        return switch (typeValue) {
          case "engineer" -> new Engineer();
          case "manager" -> new Manager();
          case "salesman" -> new Salesman();
          default -> throw new IllegalStateException("Unexpected value: " + typeValue);
        };
    }

    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    //상위로 올릴 수 있음
    public String capitalizedType() {
        return this.type.toString().substring(0, 1).toUpperCase() + this.type.toString().substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type.toString() + '\'' +
                '}';
    }
}
