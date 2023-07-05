package ss2.practice;

import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        int a = scanner.nextInt();


        System.out.println("nhap b");
        int b = scanner.nextInt();


        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("khong co uoc so chung ");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("uoc so chung lon nhat la: " + a);
    }
}
