package com.teachmeskills.lesson12.part2;

import java.util.HashSet;
import java.util.Set;

public class GroupUniqueStudents {
    public static void main(String[] args) {

        //we add the unique names of our group + teacher to the collection and display them on the screen
        Set<String> names = new HashSet<>();

        names.add("Dovlet");
        names.add("Roman");
        names.add("Vladimir");
        names.add("Tatiana");
        names.add("Gleb");
        names.add("Dmitry");
        names.add("Alexey");
        names.add("Alexander");
        names.add("Vladislav");
        names.add("Andrey");
        names.add("Andrey"); //teacher

        for (String name : names){
            System.out.println(name);
        }
    }
}
