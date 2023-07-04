package ss1.exercises;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;

        System.out.println("nhap USD vao day kiem tra");
        int USD = scanner.nextInt();

        System.out.println(USD + " USD quy doi se bang " + USD * rate + " VND");
    }
}
