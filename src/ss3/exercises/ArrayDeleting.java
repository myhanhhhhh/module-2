package ss3.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("nhap so can xoa ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
                break;
            }
        }
        System.out.println(Arrays.toString( arr));
    }
}
