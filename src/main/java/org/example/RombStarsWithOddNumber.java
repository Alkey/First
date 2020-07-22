package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RombStarsWithOddNumber {
    public static void drawRomb(int x) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 0; i <= x / 2; i++) {
            for (int j = 0; j < x; j++) {
                if (j == x / 2 - i) {
                    for (int k = 0; k < count; k++) {
                        builder.append("*");
                    }
                    count += 2;
                } else {
                    builder.append(" ");
                }
            }
            builder.append("\n");
        }
        count = x - 2;
        for (int i = x / 2; i > 0; i--) {
            for (int j = 0; j < x; j++) {
                if (j == x / 2 - i + 1) {
                    for (int k = 0; k < count; k++) {
                        builder.append("*");
                    }
                    count -= 2;
                } else {
                    builder.append(" ");
                }
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Input romb size:");
            try {
                int input = Integer.parseInt(reader.readLine());
                if (input % 2 == 0) {
                    System.out.println("Input positive odd number!");
                } else if (input == -1) {
                    break;
                } else if (input < -1) {
                    System.out.println("Input positive odd number!");
                } else {
                    drawRomb(input);
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Please enter the number!");

            }
        }
    }
}
