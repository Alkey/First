package org.example;

public class Triangle extends Figure {

    private double cathetusA;
    private double cathetusB;

    public Triangle(Color color, int cathetusA, int cathetusB) {
        super(color);
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a Triangle!");
    }

    @Override
    public double findSquare() {
        return (cathetusA * cathetusB) / 2;
    }

    @Override
    public Color getColor() {
        return super.color;
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
    }

    @Override
    public String toString() {
        return "Фигура: треугольник, площадь: " + findSquare() + " кв. ед.," +
                " длина гипотенузы: " + getHypotenuse() + " ед., " +
                "цвет: " + getColor().getValue();
    }
}
