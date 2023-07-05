package ss2.practice;

import com.sun.org.apache.xalan.internal.xsltc.DOM;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("nhap so tien gui");
        money = scanner.nextDouble();

        System.out.println("nhap thang gui");
        month = scanner.nextInt();

        System.out.println("nhap lai suat");
        interestRate = scanner.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("lai suat la: " + total);
    }
}
