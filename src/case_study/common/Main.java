package case_study.common;

import case_study.repository.CustomerRepo;
import case_study.repository.ICustomerRepo;

import static case_study.controller.FuramaController.scanner;

public class Main {
    private static final String REGEX_ID = "NV-[0-9]{4}";
    private static final String REGEX_NAME = "^[A-Z]{1}[a-z]+";
    private static final String REGEX_DATEOFBIRTH = "";
    private static final String REGEX_SALARY = "^([0-9])+?$";
    private static final String REGEX_ID_CUSTOMER = "KH-[0-9]{4}";


    public static String validateIdCustomer() {
        boolean checkId;
        String id;
        System.out.println("enter id");
        do {
            id = scanner.nextLine();
            checkId = id.matches(REGEX_ID_CUSTOMER);
            if (checkId == false) {
                System.out.println("please enter again");
            }
        } while (checkId == false);
        return id;
    }

    public static String checkIndex() {
        ICustomerRepo iCustomerRepo = new CustomerRepo();
        String idChecked = validateIdCustomer();
        int index = iCustomerRepo.searchIndex(idChecked);
        do {
            if (index == -1) {
                return checkIndex();
            }else {
                return idChecked;
            }
        } while (true);
    }
    public static String checkCustomerType() {
        int option;
            System.out.println("enter cutomerType");
            System.out.println("1. Diamond");
            System.out.println("2. Platimnum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Diamond");
                    break;
                case 2:
                    System.out.println("Platimnum");
                    break;
                case 3:
                    System.out.println("Gold");
                case 4:
                    System.out.println("Silver");
                    break;
                case 5:
                    System.out.println("Member");
            }
            return checkCustomerType();
    }
    public static void main(String[] args) {
        checkCustomerType();
    }
}
