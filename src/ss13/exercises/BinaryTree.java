package ss13.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        System.out.println("nhap do dai mang");
        int size = scanner.nextInt();
        System.out.println("nhap so vao mang:");
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            myList.add(number);
        }
        System.out.println("mang vua tao:" + myList);
        myList.sort(((o1, o2) -> o1 - o2));
        System.out.println("mang sap xep tang dan: " + myList);
        System.out.println("nhap so can tim:");
        int number = scanner.nextInt();
        System.out.println("so can tim o vi tri thu " + binarySearch(myList, 0, myList.size() - 1, number));
    }

    public static int binarySearch(List<Integer> list, int left, int right, int value) {
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value < list.get(mid))
                right = mid - 1;
            else if (value == list.get(mid)) {
                return mid;
            } else
                left = mid + 1;
        }
        return -1;
    }
}

