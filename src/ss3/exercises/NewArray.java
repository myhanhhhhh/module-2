package ss3.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7};
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            if (i >= arr1.length) {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
