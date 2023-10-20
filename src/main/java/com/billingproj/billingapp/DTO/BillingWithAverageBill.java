package com.billingproj.billingapp.DTO;

import com.billingproj.billingapp.model.Billing;


public class BillingWithAverageBill {

    private Billing billing;
    private double averageBill;

    public BillingWithAverageBill(Billing billing, double averageBill) {
        this.billing = billing;
        this.averageBill = averageBill;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public double getAverageBill() {
        return averageBill;
    }

    public void setAverageBill(double averageBill) {
        this.averageBill = averageBill;
    }
}
