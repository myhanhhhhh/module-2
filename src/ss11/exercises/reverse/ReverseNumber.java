package ss11.exercises.reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so vao de kiem tra");
        String number = scanner.nextLine();
        String arr[] = number.split("");
        for (int i = 0; i < arr.length; i++) {
            myStack.push(arr[i]);
        }
        System.out.println("truoc khi dao nguoc: ");
        for (String element : myStack) {
            System.out.println(element);
        }
        System.out.println("sau khi dao nguoc: ");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}

