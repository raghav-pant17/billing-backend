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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_id")
    private List<BillData> billingData = new ArrayList<>();

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

    public List<BillData> getBillingData() {
        return billingData;
    }

    public void setBillingData(List<BillData> billingData) {
        this.billingData = billingData;
    }

    public void setBillingYear(Integer billingYear) {
        this.billingYear = billingYear;
    }




}
