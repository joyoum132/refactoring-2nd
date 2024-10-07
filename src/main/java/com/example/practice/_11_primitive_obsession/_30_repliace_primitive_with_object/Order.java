package com.example.practice._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    //type safety 보장하지 못함 > 아무 값이나 사용할 수 있음
//    private String priorityValue;

    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    //    public Order(String priority) {
//        this.priorityValue = priority;
//    }


}
