package ss6.exercises.point2d_point3d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap y");
        float y = Float.parseFloat(scanner.nextLine());
        Point2d point2d = new Point2d(x, y);
        System.out.println(point2d);

        System.out.println("nhap x");
        float x1 = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap y");
        float y1 = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap z");
        float z = Float.parseFloat(scanner.nextLine());
        Point3d point3d = new Point3d(x1, y1, z);
        System.out.println(point3d);
    }

}
