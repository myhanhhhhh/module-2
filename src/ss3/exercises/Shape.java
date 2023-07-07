package ss3.exercises;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        shapes();
    }

    public static void shapes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai canh");
        int width = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= width * 2 + 1; j++) {
                if (i + j == width || j - i == width + 1) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = width - 2; i >= 0; i--) {
            for (int j = width * 2 + 1; j >= 0; j--) {
                if (i + j == width || j - i == width + 1) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

