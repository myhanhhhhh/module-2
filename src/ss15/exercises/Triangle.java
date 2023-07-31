package ss15.exercises;

public class Triangle {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("OK");
        } else {
            throw new IllegalTriangleException("Loi");
        }
    }
}
