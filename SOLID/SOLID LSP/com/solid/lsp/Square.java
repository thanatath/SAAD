package com.solid.lsp;

public class Square implements Shape{

    private int area;
    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side*side;
    }
 
    public int getSide() {
        return this.side;
    }
}