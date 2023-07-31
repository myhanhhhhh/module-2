package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        Integer option;
        do {
            System.out.println("---Work Management---");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Booking Management");
            System.out.println("6. Promotion Management");
            System.out.println("7. Exit");
            System.out.println("Enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    EmployeeController.showMenu();
                    break;
                case 2:
                    CustomerController.showMenu1();
            }
        } while (true);
    }
}
