package org.example;

public abstract class Figure {

    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void drawFigure();

    public abstract double findSquare();

    public abstract Color getColor();
}
