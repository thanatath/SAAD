package com.solid.lsp;

public class Square extends Rectangle implements Ifsqure {
    private int side;
    Square(int side) {
        this.setSide(side);
    }

    public int getArea() {
        return this.side * this.side;
    }

    public int setSide(int side) {
        this.side = side;
    }
}
