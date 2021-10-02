package com.solid.lsp;

public class Square extends Rectangle  {
    private int side;
    Square(int side) {
        this.setSide(side);
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
