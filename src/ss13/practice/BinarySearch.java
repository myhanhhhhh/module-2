package ss13.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap phan tu vao mang");
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            list.add(number);
        }
        System.out.println("mang vua tao:" + list);
        list.sort(((o1, o2) -> o1 - o2));
        System.out.println("mang sap xep tang dan: " + list);
        System.out.println("nhap so can tim:");
        int number = scanner.nextInt();
        System.out.println("so can tim o vi tri thu " + binarySearch(list,number));
    }

    public static int binarySearch(List<Integer> myList, int key) {
        int low = 0;
        int high = myList.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < myList.get(mid)) {
                high = mid - 1;
            } else if (key == myList.get(mid)) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
