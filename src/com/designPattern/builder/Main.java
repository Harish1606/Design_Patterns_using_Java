package com.designPattern.builder;

//The Builder design pattern is a creational design pattern that allows for the construction of complex objects step by step. It separates the construction of an object from its representation so that the same construction process can create different representations. This pattern is particularly useful when an object needs to be constructed with many optional parameters or when the construction process is complex.
public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(2).setBattery(5000).getPhone();
        System.out.println(phone.toString());
    }
}
