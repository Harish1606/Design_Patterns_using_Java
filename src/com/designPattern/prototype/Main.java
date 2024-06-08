package com.designPattern.prototype;

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
