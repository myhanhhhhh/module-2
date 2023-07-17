package ss11.exercises;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
//        System.out.println(myStack);
        System.out.println("truoc khi dao nguoc: ");
        for (int element: myStack) {
            System.out.println( element);
        }
        System.out.println("sau khi dao nguoc: ");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}

