package ss15.exercises;

public class TriangleCheck {
    public void checkTriangle(int a, int b, int c) throws TriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("OK");
        } else {
            throw new TriangleException("Loi");
        }
    }
}
