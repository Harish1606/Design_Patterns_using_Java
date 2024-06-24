package com.designPattern.singleton;

//The Singleton design pattern in Java is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance. This pattern is useful when exactly one object is needed to coordinate actions across the system.
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
