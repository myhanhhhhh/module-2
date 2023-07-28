package case_study.common;

import static case_study.controller.FuramaController.scanner;

public class Exception {
    public static String ValidateSalaryEmployee() {
        Integer salary = 0;
        System.out.println("enter salary");
        do {
            try {
                salary = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("hay nhap so");
            }

            if (salary <= 0) {
                System.out.println("please enter again");
            }
        } while (salary <= 0);
        return null;
    }
}
