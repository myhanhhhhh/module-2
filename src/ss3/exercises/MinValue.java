package ss3.exercises;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int length = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("nhap phan tu trong mang thu " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat la: " + min);
    }
}
