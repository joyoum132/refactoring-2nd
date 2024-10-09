package com.example.practice._16_temporary_field._36_introduce_special_case;

/*특정 케이스 추가, Null Object 패턴 을 적용하여 로직을 간결하게 바꿈 */
public class CustomerService {

    public String customerName(Site site) {
        return site.getCustomer().getName();
    }

    public BillingPlan billingPlan(Site site) {
        return site.getCustomer().getBillingPlan();
    }

    public int weeksDelinquent(Site site) {
        return site.getCustomer().getPaymentHistory().getWeeksDelinquentInLastYear();
    }

}
