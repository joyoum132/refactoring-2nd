package com.example.practice._18_middle_man._40_replace_subclass_with_delegate;

import java.time.LocalDateTime;

//회색 > 미사용
public class PremiumBooking extends Booking {

    private PremiumExtra extra;

    public PremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        super(show, time);
        this.extra = extra;
    }

//    //중개자 역할
//    @Override
//    public boolean hasTalkback() {
//        System.out.println("premium");
//        return this.premiumDelegate.hasTalkback();
//    }

//    @Override
//    public double basePrice() {
//        return Math.round(super.basePrice() + this.extra.getPremiumFee());
//    }

//    public boolean hasDinner() {
//        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
//    }
}
