package ss11.practice.linkedList;

public class GenericStackClient {
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("pne");
        System.out.println("1.1 size of stack after push operations: " + stack.size());
        System.out.println("1,2. pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
