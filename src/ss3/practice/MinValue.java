package ss3.practice;


import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 0, 4, 5, 6, 7};
        System.out.println(Min(arr));
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
