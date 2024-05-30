package com.designPattern.adapter;

//The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.
//In Java, this pattern is often used when you want to use a class that doesn't match the interface you need. It can also be used to make existing classes work with others without modifying their source code.
public class School {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(p);
        assignment.writeAssignment("I need to write assignment");
    }
}
