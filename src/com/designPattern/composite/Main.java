package com.designPattern.composite;

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
