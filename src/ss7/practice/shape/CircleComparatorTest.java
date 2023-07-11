package ss7.practice.shape;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.6);
        circles[2] = new Circle("blue", true, 3.5);

        System.out.println("Pre-sorted: ");
        for (Circle value : circles) {
            System.out.println(value);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for (Circle value : circles) {
            System.out.println(value);
        }
    }
}