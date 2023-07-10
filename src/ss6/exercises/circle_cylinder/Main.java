package ss6.exercises.circle_cylinder;

import ss6.exercises.circle_cylinder.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh hinh tron vao di");
        double radius1 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mau hinh tron vao di");
        String color1 = scanner.nextLine();
        Circle circle = new Circle(radius1, color1);
        System.out.println(circle);

        System.out.println("nhap ban kinh hinh tru vao di");
        double radius2 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chieu cao vao di");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mau hinh tru vao di");
        String color2 = scanner.nextLine();
        Cylinder cylinder = new Cylinder(radius2, color2, height);
        System.out.println(cylinder);
    }
}
