package ss3.practice;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int array[];
        do {
            System.out.println("nhap size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size khong nen vuot qua 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhap phan tu " + (i + 1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("thong tin danh sach: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat trong danh sach la: " + max + "tai vi tri: " + index);
    }
}
