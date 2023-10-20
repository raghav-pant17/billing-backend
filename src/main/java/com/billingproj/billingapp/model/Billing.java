package com.billingproj.billingapp.model;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Billing {

    @Id
    @GeneratedValue
    private Long id;

    private Double balance;
    private Date dueDate;

    private Date autopaidDueDate;

    private Integer userCardNo;

    private Integer billingYear;

    //private Integer averageBill;

    @ElementCollection
    @CollectionTable(name = "months", joinColumns = @JoinColumn(name = "billing_id"))
    @Column(name = "month")
    private List<String> months;

    @ElementCollection
    @CollectionTable(name = "bills", joinColumns = @JoinColumn(name = "billing_id"))
    @Column(name = "bill")
    private List<Double> bills;

    public Billing() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setUserDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getAutopaidDueDate() {
        return autopaidDueDate;
    }

    public void setAutopaidDueDate(Date autopaidDueDate) {
        this.autopaidDueDate = autopaidDueDate;
    }

    public Integer getUserCardNo() {
        return userCardNo;
    }

    public void setUserCardNo(Integer userCardNo) {
        this.userCardNo = userCardNo;
    }

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public List<Double> getBills() {
        return bills;
    }

    public void setBills(List<Double> bills) {
        this.bills = bills;
    }

    public Integer getBillingYear() {
        return billingYear;
    }

    public void setBillingYear(Integer billingYear) {
        this.billingYear = billingYear;
    }
}
