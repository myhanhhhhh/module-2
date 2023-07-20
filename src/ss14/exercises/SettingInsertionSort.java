package ss14.exercises;

import java.util.Scanner;

public class SettingInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap phan tu cu mang");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang cua ban: ");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("mang sau khi sap xep");
        insertionSort(arr);
    }

    public static void insertionSort(int[] array) {
        int x;
        int position;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            position = i;
            while (position > 0 && x < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = x;
        }
        for (int num : array) {
            System.out.println(num);
        }
    }
}

