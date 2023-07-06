package ss3.exercises;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "kiem tra thoai mai";
        System.out.println("Nhap ki ma tu ban muon tim:");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Co %d ki tu %s trong chuoi", count, character);
    }
}