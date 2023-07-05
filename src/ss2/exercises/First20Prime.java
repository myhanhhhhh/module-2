package ss2.exercises;

import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so vao de kiem tra");
        int number = scanner.nextInt();
        int countSnt = 0;
        for (int i = 2; countSnt < number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                countSnt++;
            }
        }
    }
}
