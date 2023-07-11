package ss7.practice.shape;

import ss7.practice.shape.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red", false, 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle value : circles) {
            System.out.println(value);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle value : circles) {
            System.out.println(value);
        }
    }
}