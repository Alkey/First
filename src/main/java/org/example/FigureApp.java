package org.example;

import java.util.Random;

public class FigureApp {

    public static Figure[] generateFigures() {
        Random random = new Random();
        int size = random.nextInt(19) + 1;
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            int figureNumber = random.nextInt(3) + 1;
            switch (figureNumber) {
                case 1:
                    figures[i] = new Circle(generateColor(), generateRandomInt());
                    break;
                case 2:
                    figures[i] = new Square(generateColor(), generateRandomInt());
                    break;
                case 3:
                    figures[i] = new Triangle(generateColor(), generateRandomInt(), generateRandomInt());
                    break;
                case 4:
                    figures[i] = new Trapezoid(generateColor(), generateRandomInt(), generateRandomInt(), generateRandomInt());
                    break;
            }
        }
        return figures;
    }

    public static String generateColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(4) + 1;
        switch (colorNumber) {
            case 1:
                return "зеленый";
            case 2:
                return "желтый";
            case 3:
                return "черный";
            case 4:
                return "красный";
            default:
                return "белый";
        }
    }

    public static int generateRandomInt() {
        return new Random().nextInt(10) + 1;
    }

    public static void main(String[] args) {
        for (Figure figure : generateFigures()) {
            System.out.println(figure.toString());
        }
    }
}
