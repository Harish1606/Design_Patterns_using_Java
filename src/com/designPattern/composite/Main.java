package com.designPattern.composite;

//The Composite design pattern is a structural pattern used to compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly. This is particularly useful for building complex UI components, file systems, or organizational hierarchies.
public class Main {
    public static void main(String[] args) {
        Leaf hardDrive = new Leaf(4000,"Hard Drive");
        Leaf mouse = new Leaf(500,"Mouse");
        Leaf monitor = new Leaf(8000,"Monitor");
        Leaf ram = new Leaf(3000,"Ram");
        Leaf cpu = new Leaf(9000,"CPU");

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
