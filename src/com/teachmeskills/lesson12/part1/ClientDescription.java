package com.teachmeskills.lesson12.part1;

import java.util.ArrayList;

/**
 * Class for describing the client
 */
public class ClientDescription {

    private String client_date_registration;
    private String client_name;
    private int client_age;
    private String client_sex;
    private ArrayList<ClientOrders> arrayList = new ArrayList<>();
    public ClientDescription(String client_date_registration, String client_name, int client_age, String client_sex){
        this.client_date_registration =client_date_registration;
        this.client_name = client_name;
        this.client_age = client_age;
        this.client_sex = client_sex;
    }

    //method of adding a customer's order to the collection
    public void addOrder(ClientOrders orders){
        arrayList.add(orders);
    }

    @Override
    public String toString() {
        return "Client: [" +
                "Registration='" + client_date_registration + '\'' +
                ", Name='" + client_name + '\'' +
                ", Age=" + client_age +
                ", Sex='" + client_sex + '\'' +
                ", Orders=" + arrayList +
                ']';
    }
}
