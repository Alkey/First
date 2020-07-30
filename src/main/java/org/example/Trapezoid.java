package org.example;

public class Trapezoid extends Figure {

    private int height;
    private double sideA;
    private double sideB;

    public Trapezoid(Color color, int height, int sideA, int sideB) {
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
    public double findSquare() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public Color getColor() {
        return super.color;
    }

    public int getHeight() {
        return height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция, площадь: " + findSquare() + " кв. ед.," +
                " длина стороны А: " + getSideA() + " ед., " +
                " длина стороны В: " + getSideB() + " ед., " +
                " высота: " + getHeight() + " ед., " +
                "цвет: " + getColor().getValue();
    }
}
