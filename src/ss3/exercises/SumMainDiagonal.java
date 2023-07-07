package ss3.exercises;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap cot");
        int col = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[row][col];
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
        System.out.println("Tong 2 duong cheo : " + sum(arr));
    }

    public static int sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum += arr[i][(arr.length-1)-i];
        }
        return sum;
    }
}
