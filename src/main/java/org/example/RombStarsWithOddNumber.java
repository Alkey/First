package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RombStarsWithOddNumber {
    public static void romb (int x) {

        int count = 1;
        for (int i = 0; i <= x/2; i++) {
            for (int j = 0; j < x; j++) {
                if (j == x/2 - i) {
                    for (int k = 0; k < count; k++) {
                        System.out.print("*");
                    }
                    count+=2;
                }
                else if (j == x - 1){
                    System.out.println(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
        int count2 = x - 2;
        for (int i = x/2; i > 0; i--) {
            for (int j = 0; j <x; j++) {
                if (j == x/2 - i + 1) {
                    for (int k = 0; k < count2; k++) {
                        System.out.print("*");
                    }
                    count2 -= 2;
                }
                else if (j == x - 1) {
                    System.out.println(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
        int input = Integer.parseInt(reader.readLine());
            if (input % 2 == 0) {
                System.out.println("Введите нечетное число.");
            }
            else if ( input == -1) {
                break;
            }
            else {
                romb(input);
            }
        }
    }
}
