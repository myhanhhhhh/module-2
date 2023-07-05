package ss1.exercises;

import java.util.Scanner;

public class English {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let enter number : ");
        int number = Integer.parseInt(scanner.nextLine());
        String[] arr1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr10 = {"ten", "eleven", "twelve", "thirdteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arr100 = {"zero", "ten", "twenty", "thirdty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number < 10) {
            System.out.println(arr1[number]);
        } else if (number < 20) {
            System.out.println(arr10[number % 10]);
        } else if (number < 100) {
            System.out.println(arr100[number / 10] + arr1[number % 10]);
        } else {
            if ((number % 100) / 10 == 1) {
                System.out.println(arr1[number / 100] + " hundred " + " and " + arr10[number % 10]);
            } else if ((number % 100) / 10 == 0) {
                System.out.println(arr1[number / 100] + " hundred " + " and " + arr1[number % 10]);
            } else if ((number % 10 == 0)) {
                System.out.println(arr1[number / 100] + " hundred " + " and " + arr100[(number % 100) / 10]);
            } else {
                System.out.println(arr1[number / 100] + " hundred " + " and " + arr100[(number % 100) / 10] + arr1[number % 10]);
            }
        }
    }
}