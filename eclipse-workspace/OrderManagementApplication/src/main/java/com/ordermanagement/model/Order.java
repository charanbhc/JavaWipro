package com.ordermanagement.model;

public class Order {
    private int orderId;
    private String[] items;
    private boolean status; // true if active, false if cancelled

    public Order(int orderId, String[] items, boolean status) {
        this.orderId = orderId;
        this.items = items;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
