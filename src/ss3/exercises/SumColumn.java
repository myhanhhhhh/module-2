package ss3.exercises;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class SumArray {
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
        System.out.println(" ");
        System.out.println("ban muon tinh tong cot nao?");
        int column = Integer.parseInt(scanner.nextLine());
//        System.out.println(Sum(arr,column));
    }

//    public static int Sum(int arr[][],int column) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//                sum += arr[i][column];
//            }
//        return sum;
//    }
}
