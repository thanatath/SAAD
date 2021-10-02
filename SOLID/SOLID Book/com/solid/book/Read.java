package com.solid.book;

public class Read{
    Book book;
    public Read(Book book){
        this.book = book;
    }
    public void reader() {

        do {
            System.out.println(this.book.getCurrentPage());
        } while (this.book.turnToNextPage());
    }
}
