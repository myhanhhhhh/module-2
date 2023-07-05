package ss3.practice;

import java.util.Scanner;

public class TheReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("nhap size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size khong vuot qua 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap phan tu " + ( i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20%s", "phan tu trong mang", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int tempt = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = tempt;
        }
        System.out.printf("\n%-20s%s", "dao nguoc mang", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
