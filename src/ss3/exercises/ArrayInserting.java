package ss3.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInserting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr1[] = new int[arr.length + 1];
        System.out.println("nhap vi tri can chen");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so can chen");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        arr1[index] = number;
        for (int i = index + 1; i < arr1.length; i++) {
            arr1[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}

