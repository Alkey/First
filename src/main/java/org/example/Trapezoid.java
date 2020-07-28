package org.example;

public class Trapezoid extends Figure {

    private final int height;
    private final int sideA;
    private final int sideB;

    public Trapezoid(String color, int height, int sideA, int sideB) {
        super(color);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a Trapezoid!");
    }

    @Override
    public int findSquare() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getHeight() {
        return height;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция, площадь: " + findSquare() + " кв. ед.," +
                " длина стороны А: " + getSideA() + " ед., " +
                " длина стороны В: " + getSideB() + " ед., " +
                " высота: " + getHeight() + " ед., " +
                "цвет: " + getColor();
    }
}
