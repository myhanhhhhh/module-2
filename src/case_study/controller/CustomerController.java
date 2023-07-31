package case_study.controller;

import case_study.service.CustomerService;
import case_study.service.ICustomerService;

import static case_study.controller.FuramaController.scanner;

public class CustomerController {
    public static ICustomerService service = new CustomerService();

    public static void showMenu1() {
        boolean flag = true;
        int option;
        do {
            System.out.println("---Customer Management---");
            System.out.println("1. List Customer");
            System.out.println("2. Add Customer");
            System.out.println("3. Edit Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Search Customer");
            System.out.println("6. Return menu ");
            System.out.println("Enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addCustomer();
                    break;
                case 3:
                    service.editCustomer();
                    break;
                case 4:
                    service.deleteCustomer();
                    break;
                case 5:
                    service.searchCustomer();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
