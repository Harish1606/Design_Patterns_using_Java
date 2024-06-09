package com.designPattern.observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + this.name + ", " + this.channel.getTitle() + " Video uploaded");
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }

}
