package com.example.practice._18_middle_man._40_replace_subclass_with_delegate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;

    protected LocalDateTime time;

    protected PremiumDelegate premiumDelegate;

    public Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBook(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    //static factory method 사용시 생성자 이름 변경 가능
    //리턴 타입이 자유로움(자식객체 가능)
    public static Booking createPremiumBook(Show show, LocalDateTime time, PremiumExtra premiumExtra) {
//        Booking premiumBooking = new Booking(show, time); //new PremiumBooking() 대신 new Booking()
        Booking premiumBooking = createBook(show, time); // 메소드 체이닝 사용
        premiumBooking.premiumDelegate = new PremiumDelegate(premiumBooking, premiumExtra);
        return premiumBooking;
    }

    //MOVE TO Delegate
    public boolean hasTalkback() {
        System.out.println("basic");
        return this.premiumDelegate != null
                ? this.premiumDelegate.hasTalkback()
                : this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return this.premiumDelegate == null ? result : this.premiumDelegate.extendBasePrice(result);
    }

    public boolean hasDinner() {
        return this.premiumDelegate != null && this.premiumDelegate.hasDinner();
    }
}
