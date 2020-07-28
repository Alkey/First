package org.example;

public abstract class Figure {

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void drawFigure();

    public abstract int findSquare();

    public abstract String getColor();
}
