package ss15.exercises;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCheck check = new TriangleCheck();
        do {
            try {
                System.out.println("nhap canh a");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh b");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh c");
                int c = Integer.parseInt(scanner.nextLine());
                try {
                    check.checkTriangle(a, b, c);
                } catch (TriangleException e) {
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("da xay ra loi. Hay nhap lai !");
            }
        } while (true);
    }
}
