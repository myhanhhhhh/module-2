package ss11.exercises.reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi vao de kiem tra");
        String str = scanner.nextLine();
        String arr[] = str.split("");
        System.out.print("truoc khi dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            myStack.push(arr[i]);
        }
        System.out.println(myStack);
        System.out.print("sau khi dao nguoc: ");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
