package com.example.practice._16_temporary_field._36_introduce_special_case;

public class Site {

    private Customer customer;

    //어떤 회원 유형인지 분기처리
    public Site(Customer customer) {
        this.customer = customer.getName().equals("unknown") ? new UnknownCustomer() : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
