package com.creators.anu.producer.model;

import java.util.Map;
import java.util.UUID;

public class Order {
    private UUID orderId;
    private UUID customerId;
    private Map<UUID, Integer> itemlist;
    private OrderStatus orderStatus;

    public Order(UUID customerId, Map<UUID, Integer> itemlist){
        orderId = UUID.randomUUID();
        this.customerId = customerId;
        this.itemlist = itemlist;
        this.orderStatus = OrderStatus.ORDERED;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public Map<UUID, Integer> getItemlist() {
        return itemlist;
    }

    public void setItemlist(Map<UUID, Integer> itemlist) {
        this.itemlist = itemlist;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
