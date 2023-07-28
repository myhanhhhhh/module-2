package case_study.common;

import case_study.repository.CustomerRepo;
import case_study.repository.ICustomerRepo;

import javax.jws.soap.SOAPBinding;

import static case_study.controller.FuramaController.scanner;

public class Regex {
    private static final String REGEX_ID_EMPLOYEE = "NV-[0-9]{4}";
    private static final String REGEX_NAME = "(\\p{Lu}\\p{Ll}+\\s?)+";
    private static final String REGEX_DATEOFBIRTH = "([0-2][0-9]|30|31)\\/([0-1][0-9]|10|11|12)\\/(200[0-5]|19[6-9][0-9])$";
    private static final String REGEX_IDENTITY = "^[0-9]{9}([0-9]{3})?$";
    private static final String REGEX_PHONENUMBER = "^0[0-9]{9}$";
    //    private static final String REGEX_SALARY = "^([0-9])+?$";
    private static final String REGEX_ID_CUSTOMER = "KH-[0-9]{4}";

    public static String checkIndex() {
        ICustomerRepo iCustomerRepo = new CustomerRepo();
        String idChecked = validateIdCustomer();
        int index = iCustomerRepo.searchIndex(idChecked);
        do {
            if (index == -1) {
                return checkIndex();
            } else {
                return idChecked;
            }
        } while (true);
    }

    public static String validateIdCustomer() {
        boolean checkId;
        String id;
        System.out.println("enter id");
        do {
            id = scanner.nextLine();
            checkId = id.matches(REGEX_ID_CUSTOMER);
            if (checkId == false) {
                System.out.println("please enter again");
            } else {
                ICustomerRepo iCustomerRepo = new CustomerRepo();
                int index = iCustomerRepo.searchIndex(id);
                do {
                    if (index == -1) {
                        return checkIndex();
                    } else {
                        return id;
                    }
                } while (true);
            }
        } while (checkId == false);
        return id;
    }


    public static String validateIdEmployee() {
        boolean checkId;
        String id;
        System.out.println("enter id");
        do {
            id = scanner.nextLine();
            checkId = id.matches(REGEX_ID_EMPLOYEE);
            if (checkId == false) {
                System.out.println("please enter again");
            }
        } while (checkId == false);
        return id;
    }


    public static String validateName() {
        boolean checkName;
        String name;
        do {
            System.out.println("enter name");
            name = scanner.nextLine();
            checkName = name.matches(REGEX_NAME);
            if (checkName == false) {
                System.out.println("please enter again");
            }
        } while (checkName == false);
        return name;
    }

    public static String validateDateOfBirth() {
        boolean checkDateOfBirth;
        String dateOfBirth;
        do {
            System.out.println("enter dateOfBirth");
            dateOfBirth = scanner.nextLine();
            checkDateOfBirth = dateOfBirth.matches(REGEX_DATEOFBIRTH);
            if (checkDateOfBirth == false) {
                System.out.println("Please enter again");
            }
        } while (checkDateOfBirth == false);
        return dateOfBirth;
    }

    public static String validateIdentity() {
        boolean checkIdentity;
        String identity;
        do {
            System.out.println("enter identity");
            identity = scanner.nextLine();
            checkIdentity = identity.matches(REGEX_IDENTITY);
            if (checkIdentity == false) {
                System.out.println("please enter again");
            }
        } while (checkIdentity == false);
        return identity;
    }

    public static String validatePhoneNumber() {
        boolean checkPhoneNumber;
        String phoneNumber;
        System.out.println("enter phoneNumber");
        do {
            phoneNumber = scanner.nextLine();
            checkPhoneNumber = phoneNumber.matches(REGEX_PHONENUMBER);
            if (checkPhoneNumber == false) {
                System.out.println("pleas eenter again");
            }
        } while (checkPhoneNumber == false);
        return phoneNumber;
    }

    public static int ValidateSalaryEmployee() {
        Integer salary = 0;
        System.out.println("enter salary");
        do {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                if (salary>0){
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println("please enter again");
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
            case 4:
                result = "Silver";
                System.out.println("Silver");
                break;
            case 5:
                result = "Member";
                System.out.println("Member");
        }
        return result;
    }
}