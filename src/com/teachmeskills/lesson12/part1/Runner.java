package com.teachmeskills.lesson12.part1;

import java.util.Iterator;
import java.util.Map;

public class Runner implements IClientPassport {

    public static void main(String[] args) {

        //creating clients
        ClientDescription client1 = new ClientDescription(
                "06.09.2023", "Andrey", 22, "man");
        ClientDescription client2 = new ClientDescription(
                "06.09.2023", "Polina", 20, "woman");

        //creating orders
        ClientOrders orders1 = new ClientOrders(100.0, "item1", 1);
        ClientOrders orders2 = new ClientOrders(200.0, "item2", 2);
        ClientOrders orders3 = new ClientOrders(300.0, "item3", 3);
        ClientOrders orders4 = new ClientOrders(400.0, "item4", 4);

        //adding orders to the client's collection
        client1.addOrder(orders1);
        client1.addOrder(orders2);
        client2.addOrder(orders3);
        client2.addOrder(orders4);

        //adding the client's passport number as a key to the Map collection
        clientPassport.put("MP1236548", client1);
        clientPassport.put("MP7897650", client2);

        //we display clients on the screen via the "Map.Entry"
        for (Map.Entry<String, ClientDescription> client : clientPassport.entrySet()){
            System.out.println("Passport number: " + client.getKey() +"\n" + client.getValue());
            System.out.println();
        }

        //we display clients on the screen through an iterator
        Iterator<Map.Entry<String, ClientDescription>> iterator = clientPassport.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, ClientDescription> myClient = iterator.next();
            System.out.println("Passport number: "+ myClient.getKey() + "\n" + myClient.getValue());
            System.out.println();
        }

    }
}
