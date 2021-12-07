package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Payment {

    private float amount;
    private List<Order> orderList;


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
