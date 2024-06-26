package com.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Book " + i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName(this.getShopName());
        for(Book book : this.getBooks()) {
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }
}
