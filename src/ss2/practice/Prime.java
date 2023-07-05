package ss2.practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so vao kiem tra");
        int number = scanner.nextInt();
        if (number <= 2) {
            System.out.println(number + " khong phai la SNT");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " la SNT");
            } else {
                System.out.println(number + " khong phai la SNT");
            }
        }
    }
}
