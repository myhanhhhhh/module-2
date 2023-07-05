package ss1.exercises;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cua ban vao day");
        String name = scanner.nextLine();
        System.out.println("Xin chao " + name);
    }
}
