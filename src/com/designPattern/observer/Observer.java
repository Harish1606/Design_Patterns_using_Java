package com.designPattern.observer;

public interface Observer {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscribers();
    void upload(String title);

}
