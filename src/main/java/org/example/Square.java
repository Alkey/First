package org.example;

public class Square extends Figure {

    private final int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a square!");
    }

    @Override
    public int findSquare() {
        return sideLength * sideLength;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат, площадь: " + findSquare() + " кв. ед.," +
                " длина стороны: " + getSideLength() + " ед., " +
                "цвет: " + getColor();
    }
}
