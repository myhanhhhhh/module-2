package ss2.exercises;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(
                    "\n1.Print the rectangle" +
                    "\n2.nPrint the square triangle" +
                    "\n3.Print isosceles triangle" +
                    "\n4.Exit" +
                    "\n Choose in here: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("enter height:");
                int height = scanner.nextInt();
                System.out.println("enter width: ");
                int width = scanner.nextInt();

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(" *");
                    }
                    System.out.println(" ");
                }
            }
            if (choice == 2) {
                System.out.println("enter height: ");
                int height = scanner.nextInt();

                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println(" ");
                }
            }
            if (choice == 3) {
                System.out.println("enter height: ");
                int height = scanner.nextInt();

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height; j++) {
                        if (i + j <= height - 1) {
                            System.out.print(" *");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            if (choice == 4) {
                System.exit(0);
            }
        } while (true);
    }
}
