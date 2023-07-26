package ss17.exercises.product.view;

import ss17.exercises.product.controller.ProductController;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController.showMenu();
    }
}
