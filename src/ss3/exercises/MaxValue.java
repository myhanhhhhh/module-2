package ss3.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cot");
        int arr1 = scanner.nextInt();
        System.out.println("nhap hang");
        int arr2 = scanner.nextInt();
        int arr[][] = new int[arr1][arr2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu hang " + i + " cot " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mang co dang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("gia tri lon nhat: " + max);
    }
}
