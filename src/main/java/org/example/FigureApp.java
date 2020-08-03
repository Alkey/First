package org.example;

import java.util.Random;

public class FigureApp {
    private static final int MAX_FIGURES_AMOUNT = 19;
    private static final int RANDOM_INT = 4;

    private static Figure[] generateFigures() {
        Random random = new Random();
        int size = random.nextInt(MAX_FIGURES_AMOUNT) + 1;
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            int figureNumber = random.nextInt(RANDOM_INT);
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
                default:
                    figures[i] = new Trapezoid(generateColor(), generateRandomInt(),
                            generateRandomInt(), generateRandomInt());
                    break;
            }
        }
        return figures;
    }

    private static Color generateColor() {
        Random random = new Random();
        int colorNumber = random.nextInt(RANDOM_INT);
        switch (colorNumber) {
            case 1:
                return Color.GREEN;
            case 2:
                return Color.YELLOW;
            case 3:
                return Color.BLACK;
            case 4:
                return Color.RED;
            default:
                return Color.WHITE;
        }
    }

    private static int generateRandomInt() {
        return new Random().nextInt(MAX_FIGURES_AMOUNT) + 1;
    }

    public static void main(String[] args) {
        for (Figure figure : generateFigures()) {
            System.out.println(figure.toString());
        }
    }
}
