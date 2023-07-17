package ss11.exercises.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        Stack<String> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi vao de kiem tra");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            myStack.push(arr[i]);
            myQueue.add(arr[i]);
        }
        while (!myQueue.isEmpty()) {
            if (!myStack.pop().equals(myQueue.remove())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("là chuỗi Palindrome");
        } else {
            System.out.print(" không phải là chuỗi Palindrome");
        }
    }
}

