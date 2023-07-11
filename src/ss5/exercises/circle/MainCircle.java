package ss5.exercises.circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mau vao di");
        String color = scanner.nextLine();
        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.setColor(color);
        System.out.println(circle.toString());
    }
}
