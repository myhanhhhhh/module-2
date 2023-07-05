package ss3.practice;

import com.sun.org.apache.xalan.internal.xsltc.DOM;

import java.util.Scanner;

public class Template {

    public static double cToF(double c) {
        double f = (9.0 / 5) + c + 32;
        return f;
    }

    public static double fToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Menu" +
                    "\n1 F to C" +
                    "\n2 C to F" +
                    "\n3.Exit" +
                    "\nEnter your choice"
            );
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("nhap f");
                    double f = Double.parseDouble(scanner.nextLine());
                    System.out.println("F to C:  " + fToC(f));
                    break;
                case "2":
                    System.out.println("nhap c");
                    double c = Double.parseDouble(scanner.nextLine());
                    System.out.println("C to F: " + cToF(c));
                    break;
                default:
                    System.out.println("nhap lai");
            }
        } while (true);
    }
}
