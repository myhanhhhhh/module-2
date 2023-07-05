package ss2.exercises;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so de kiem tra");
        int number = Integer.parseInt(scanner.nextLine());
        int countSnt = 0;
        for (int i = 2; countSnt < number; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i + "\n");
                    countSnt++;
                }
        }
    }
}
