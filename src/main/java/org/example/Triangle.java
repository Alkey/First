package org.example;

public class Triangle extends Figure {

    private final int cathetusA;
    private final int cathetusB;

    public Triangle(String color, int cathetusA, int cathetusB) {
        super(color);
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw a Triangle!");
    }

    @Override
    public int findSquare() {
        return (cathetusA * cathetusB) / 2;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    public int getCathetusA() {
        return cathetusA;
    }

    public int getCathetusB() {
        return cathetusB;
    }

    public int getHypotenuse() {
        return (int) Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
    }

    @Override
    public String toString() {
        return "Фигура: треугольник, площадь: " + findSquare() + " кв. ед.," +
                " длина гипотенузы: " + getHypotenuse() + " ед., " +
                "цвет: " + getColor();
    }
}
