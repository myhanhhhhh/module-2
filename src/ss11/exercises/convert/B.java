package ss11.exercises.convert;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String has '(' or ')' to check ( example: 's * (s – a) * (s – b) * (s – c)' )");
        String string = scanner.nextLine();

        String[] strings = string.split("");

        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String sym = "(";
        String sym1 = ")";

        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (Objects.equals(strings[i], sym)) {
                stack.push(strings[i]);
            } else if (Objects.equals(strings[i], sym1)) {
                stack1.push(strings[i]);
            }
        }
        System.out.printf("\nStack contains '(' = %s", stack);
        System.out.printf("\nStack1 contains ')' = %s", stack1);

        while (!stack.isEmpty() && !stack1.isEmpty()) {
            stack.pop();
            stack1.pop();
        }

        System.out.printf("\nStack after delete '(' = %s", stack);
        System.out.printf("\nStack1 after delete ')' = %s ", stack1);

        if (stack1.isEmpty() && stack.isEmpty()) {
            System.err.println("\nTrue");
        } else {
            System.err.println("\nFalse");
        }
    }
}