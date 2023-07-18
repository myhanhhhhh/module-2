package ss9.exercises.controller;

import ss9.exercises.model.Customer;
import ss9.exercises.service.CustomerService;
import ss9.exercises.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static Scanner scanner = new Scanner(System.in);

    private static ICustomerService service = new CustomerService();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Customer Manager");
            System.out.println("1.list Customer");
            System.out.println("2.create");
            System.out.println("3.remove");
            System.out.println("4.search");
            System.out.println("9.exit");
            System.out.println("enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addCustomer();
                    break;
                case 3:
                    service.removeCustomer();
                    break;
                case 4:
                    service.searchCustomer();
                    break;
                case  9:
                    System.exit(0);
            }
        } while (true);
    }
}
