package com.example.practice._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) throws IllegalAccessException {
        /*NOTE assert 로 discountRate 은 NotNull 임을 표현*/
        if(discountRate != null && discountRate > 0){
            throw new IllegalAccessException("할인률은 양수");
        }
        assert discountRate != null && discountRate > 0;
        this.discountRate = discountRate;
    }
}
