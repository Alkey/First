package org.example;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a Circle!");
    }

    @Override
    public int findSquare() {
        return (int) ((radius * radius) * Math.PI);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг, площадь: " + findSquare() + " кв. ед.," +
                " радиус: " + getRadius() + " ед., " +
                "цвет: " + getColor();
    }
}
