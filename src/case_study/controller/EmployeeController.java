package case_study.controller;

import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import static case_study.controller.FuramaController.scanner;

public class EmployeeController {
    public static IEmployeeService service = new EmployeeService();

    public static void showMenu() {
        int option;
        boolean flag = true;
        do {
            System.out.println("---Employee Management---");
            System.out.println("1. List employee");
            System.out.println("2. Add employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search employee");
            System.out.println("6. Return menu ");
            System.out.println("Enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addEmployee();
                    break;
                case 3:
                    service.editEmployee();
                    break;
                case 4:
                    service.deleteEmployee();
                    break;
                case 5:
                    service.searchEmployee();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        } while (flag);
    }

}
