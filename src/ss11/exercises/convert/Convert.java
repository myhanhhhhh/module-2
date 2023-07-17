package ss11.exercises.convert;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so vao de kiem tra");
        int so = Integer.parseInt(scanner.nextLine());
        int phanNguyen = so;
        int phanDu = 0;
        String ketQua = "";
        for (int i = 0; i <= phanNguyen ; i++) {
            phanDu = phanNguyen % 2;
            phanNguyen /= 2;
            myStack.push(phanDu);
        }
        for (int i = myStack.size(); i > 0; i--) {
            ketQua += myStack.pop();
        }
        System.out.println(ketQua);
    }
}
