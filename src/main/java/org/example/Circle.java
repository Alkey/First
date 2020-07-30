package org.example;

public class Circle extends Figure {

    private double radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a Circle!");
    }

    @Override
    public double findSquare() {
        return (Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public Color getColor() {
        return super.color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг, площадь: " + findSquare() + " кв. ед.," +
                " радиус: " + getRadius() + " ед., " +
                "цвет: " + getColor().getValue();
    }
}
