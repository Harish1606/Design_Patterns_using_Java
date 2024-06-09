package com.designPattern.observer;

public class Main {
    public static void main(String[] args) {
        Channel telusko = new Channel();
        Subscriber subscriber1 = new Subscriber("Harish");
        Subscriber subscriber2 = new Subscriber("Raja");
        Subscriber subscriber3 = new Subscriber("Rohan");
        Subscriber subscriber4 = new Subscriber("Akshay");

        telusko.subscribe(subscriber1);
        telusko.subscribe(subscriber2);
        telusko.subscribe(subscriber3);
        telusko.subscribe(subscriber4);

        telusko.unSubscribe(subscriber3);

        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);

        telusko.upload("Design patterns using Java");
    }
}
