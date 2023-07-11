package ss7.exercises.colorable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(1, "blue", false);
        shape[1] = new Rectangle(2, 3, "red", true);
        shape[2] = new Square(4, "black", true);
        for (Shape shape1 : shape) {
            System.out.println("gia tri truoc khi thay doi" + shape1);
        }
        for (Shape shape1 : shape) {
            shape1.resize(2);
            System.out.println("gia tri sau khi thay doi " + shape1);
        }
    }
}
