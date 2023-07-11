package ss6.exercises.point_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
