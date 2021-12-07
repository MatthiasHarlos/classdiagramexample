package com.newenergytrading.classdiagramexample;

public enum OrderStatus {

    CREATE(0),
    SHIPPING(1),
    DELIVERED(2),
    PAID(3);

        private final int status;

        private OrderStatus(int status) {
            this.status = status;
        }
}

