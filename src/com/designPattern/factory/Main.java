package com.designPattern.factory;

//The Factory Design Pattern is a creational design pattern used in object-oriented programming to create objects without specifying the exact class of the object that will be created. This pattern is particularly useful when the exact type of the object is not known until runtime, or when you want to centralize the object creation process to make it more manageable and scalable.
//In Java, the Factory Design Pattern involves creating a Factory class that has a method for creating objects. This method typically returns an interface or abstract class type, allowing the actual instantiation details to be hidden from the client.
public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS obj = operatingSystemFactory.getInstance("Open");
        obj.spec();
    }
}
