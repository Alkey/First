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
                } else if (j == x - 1) {
                    builder.append(" ");
                } else {
                    builder.append(" ");
                }
            }
            System.out.println(builder.toString());
            builder.delete(0, builder.length());
        }
        count = x - 2;
        for (int i = x / 2; i > 0; i--) {
            for (int j = 0; j < x; j++) {
                if (j == x / 2 - i + 1) {
                    for (int k = 0; k < count; k++) {
                        builder.append("*");
                        ;
                    }
                    count -= 2;
                } else if (j == x - 1) {
                    builder.append(" ");
                } else {
                    builder.append(" ");
                }
            }
            System.out.println(builder.toString());
            builder.delete(0, builder.length());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Input romb size:");
            int input = Integer.parseInt(reader.readLine());
            if (input % 2 == 0) {
                System.out.println("Input odd number!");
            } else if (input == -1) {
                break;
            } else {
                drawRomb(input);
            }
        }
    }
}
