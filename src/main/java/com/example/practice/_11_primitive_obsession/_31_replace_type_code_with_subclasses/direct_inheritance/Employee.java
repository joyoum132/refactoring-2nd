package com.example.practice._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

public abstract class Employee {

    private String name;

    //외부에서 생성자 사용하지 못하도록
    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name, type);
            case "manager" -> new Manager(name, type);
            case "salesman" -> new Salesman(name, type);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    //하위클래스에서 각자 구현할 수 있도록
    protected abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
