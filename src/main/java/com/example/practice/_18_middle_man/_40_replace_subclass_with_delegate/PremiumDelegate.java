package com.example.practice._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {
    protected Booking host;
    protected PremiumExtra premiumExtra;

    public PremiumDelegate(Booking host, PremiumExtra premiumExtra) {
        this.host = host;
        this.premiumExtra = premiumExtra;
    }

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extendBasePrice(double result) {
        return Math.round(result + this.premiumExtra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.premiumExtra.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
