package com.designPattern.prototype;

//The Prototype design pattern is a creational design pattern that enables the creation of new objects by copying an existing object, known as a prototype. This pattern is particularly useful when the cost of creating a new object is high and the creation process involves complex configurations or involves large data. In Java, the Prototype pattern typically involves implementing the Cloneable interface and overriding the clone() method.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Novelty");
        bookShop.loadData();

        BookShop bookShop1 = bookShop.clone();
        bookShop1.setShopName("Fantasy");
        bookShop1.getBooks().remove(2);

        System.out.println(bookShop);
        System.out.println(bookShop1);
    }

}
