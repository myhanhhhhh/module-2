package ss11.exercises.bracket;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ki tu vao de kiem tra");
        String str = scanner.nextLine();
        String[] string = str.split("");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        String sym1 = "(";
        String sym2 = ")";
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals(sym1)) {
                stack1.push(string[i]);
            }
        }
        for (int i = 0; i < string.length; i++) {
            if (stack1.isEmpty()) {
                break;
            } else {
                if (string[i].equals(sym2)) {
                    stack2.push(string[i]);
                }
            }
        }
        if (stack1.size() == stack2.size()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
