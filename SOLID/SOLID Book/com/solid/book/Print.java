package com.solid.book;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Print{
    Book book;
    public Print(Book book){
        this.book = book;
    }
    public void printToFile() {
        
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(this.book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = this.book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, this.book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}