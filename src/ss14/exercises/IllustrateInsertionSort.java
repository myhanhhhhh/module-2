package ss14.exercises;

import java.util.Scanner;

public class IllustrateInsertionSort {
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
            System.out.print(i + "\t");
        }
        insertionSort(arr);
    }

    public static void insertionSort(int[] array) {
        System.out.println();
        System.out.println("---bat dau chay ham chen---");
        int x;
        int position;
        System.out.println("---------------------------");
        for (int i = 1; i < array.length; i++) {
            System.out.println("vong lap thu i  (" + i + ")");
            System.out.println("gan x = array[i(=" + i + ")]" + " = " + array[i]);
            x = array[i];
            System.out.println("gan position = i = " + i);
            position = i;
            System.out.println();
            System.out.println("---- thuc hien thao tac chen----");
            while (position > 0 && x < array[position - 1]) {
                System.out.println("array[position(" + position + ")]" + " = " + array[position]);
                System.out.println("array[position-1(" + (position - 1) + ")]" + " = " + array[position - 1]);
                System.out.println("vi array[position] < array[position - 1]");
                System.out.println("gan cho array[position(" + position + ")]" + " = " + array[position] + " <- array[position-1(" + (position - 1) + ")]" + " = " + array[position - 1]);
                array[position] = array[position - 1];
                System.out.println("giam position xuong 1 don vi: position = " + position + " -> " + (position - 1));
                position--;
            }
            System.out.println("gan array[position] = x = " + x);
            array[position] = x;
            result(array);
            System.out.println("--------------------------");
        }
        System.out.println("mang sau khi sap xep");
        result(array);
    }

    public static void result(int array[]) {
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}

