package com.teachmeskills.lesson12.part1;

/**
 * Class for describing the customer's order
 */
public class ClientOrders {

    private double order_price;
    private String order_description;
    private int order_id;

    public ClientOrders(double order_price, String order_description, int order_id){
        this.order_price = order_price;
        this.order_description = order_description;
        this.order_id = order_id;

    }

    @Override
    public String toString() {
        return "{price=" + order_price +
                ", description='" + order_description + '\'' +
                ", id=" + order_id + "}";
    }
}
