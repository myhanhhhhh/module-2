package case_study.common;

import static case_study.controller.FuramaController.scanner;

public class Regex {
    private static final String REGEX_ID_EMPLOYEE = "NV-[0-9]{4}";
    private static final String REGEX_NAME = "(\\p{Lu}\\p{Ll}+\\s?)+";
    private static final String REGEX_DATEOFBIRTH = "([0-2][0-9]|30|31)\\/([0-1][0-9]|10|11|12)\\/(200[0-5]|19[6-9][0-9])$";
    private static final String REGEX_IDENTITY = "^[0-9]{9}([0-9]{3})?$";
    private static final String REGEX_PHONENUMBER = "^0[0-9]{9}$";
    private static final String REGEX_ID_CUSTOMER = "KH-[0-9]{4}";

    public static boolean validateIdCustomer(String id) {
        boolean checkId = id.matches(REGEX_ID_CUSTOMER);
        if (checkId == false) {
            System.out.println("please enter again");
        }
        return checkId;
    }


    public static boolean validateIdEmployee(String id) {
        boolean checkId = id.matches(REGEX_ID_EMPLOYEE);
        if (checkId == false) {
            System.out.println("please enter again");
        }
        return checkId;
    }


    public static boolean validateName(String name) {
        boolean checkName = name.matches(REGEX_NAME);
        if (checkName == false) {
            System.out.println("please enter again");
        }
        return checkName;
    }

    public static boolean validateDateOfBirth(String dateOfBirth) {
        boolean checkDateOfBirth = dateOfBirth.matches(REGEX_DATEOFBIRTH);
        if (checkDateOfBirth == false) {
            System.out.println("Please enter again");
        }
        return checkDateOfBirth;
    }

    public static boolean validateIdentity(String identity) {
        boolean checkIdentity = identity.matches(REGEX_IDENTITY);
        if (checkIdentity == false) {
            System.out.println("please enter again");
        }
        return checkIdentity;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        boolean checkPhoneNumber = phoneNumber.matches(REGEX_PHONENUMBER);
        if (checkPhoneNumber == false) {
            System.out.println("pleas eenter again");
        }
        return checkPhoneNumber;
    }

    public static int ValidateSalaryEmployee() {
        Integer salary = 0;
        System.out.println("enter salary");
        do {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println("please enter again");
            }
        } while (true);
    }

    public static String checkLevelEmployee() {
        int option;
        System.out.println("enter levelEmployee");
        System.out.println("1. Trung cap");
        System.out.println("2. Cao dang");
        System.out.println("3. Dai hoc");
        System.out.println("4.Sau dai hoc");
        option = Integer.parseInt(scanner.nextLine());
        String result = "";
        switch (option) {
            case 1:
                result = "Trung cap";
                System.out.println("Trung cap");
                break;
            case 2:
                result = "Cao dang";
                System.out.println("Cao dang");
                break;
            case 3:
                result = "Dai hoc";
                System.out.println("Dai hoc");
                break;
            case 4:
                result = "Sau dai hoc";
                System.out.println("Sau dai hoc");
                break;
        }
        return result;
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
        String result = "";
        switch (option) {
            case 1:
                result = "Diamond";
                System.out.println("Diamond");
                break;
            case 2:
                result = "Platimnum";
                System.out.println("Platimnum");
                break;
            case 3:
                result = "Gold";
                System.out.println("Gold");
                break;
            case 4:
                result = "Silver";
                System.out.println("Silver");
                break;
            case 5:
                result = "Member";
                System.out.println("Member");
                break;
        }
        return result;
    }
}