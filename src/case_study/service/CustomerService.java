package case_study.service;

import case_study.common.IdAvailable;
import case_study.common.IdNotFound;
import case_study.common.Regex;
import case_study.model.person.Customer;
import case_study.repository.CustomerRepo;
import case_study.repository.ICustomerRepo;

import java.util.List;
import java.util.Objects;

import static case_study.controller.FuramaController.scanner;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();

    public static String[] checkInformation() {
        String name;
        do {
            System.out.println("enter name");
            name = scanner.nextLine();
        } while (!Regex.validateName(name));
        Regex.validateName(name);
        String dateOfBirth;
        do {
            System.out.println("enter dateOfBirth");
            dateOfBirth = scanner.nextLine();
        } while (!Regex.validateDateOfBirth(dateOfBirth));
        Regex.validateDateOfBirth(dateOfBirth);
        String gender;
        do {
            System.out.println("enter gender");
            gender = scanner.nextLine();
        } while (Regex.validateDateOfBirth(gender));
        Regex.validateDateOfBirth(gender);
        String identity;
        do {
            System.out.println("enter identity");
            identity = scanner.nextLine();
        } while (!Regex.validateIdentity(identity));
        Regex.validateIdentity(identity);
        String phoneNumber;
        do {
            System.out.println("enter phoneNumber");
            phoneNumber = scanner.nextLine();
        } while (!Regex.validatePhoneNumber(phoneNumber));
        Regex.validatePhoneNumber(phoneNumber);
        System.out.println("enter email");
        String email = scanner.nextLine();
        String customerType = Regex.checkCustomerType();
        System.out.println("enter address");
        String address = scanner.nextLine();
        String array[] = {name, dateOfBirth, gender, identity, phoneNumber, email, customerType, address};
        return array;
    }


    @Override
    public void display() {
        List<Customer> customerList = repository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdCustomer(id));
            Regex.validateIdCustomer(id);
            int index = repository.searchIndex(id);
            try {
                if (index == -1) {
                    String arr[] = checkInformation();
                    Customer customer1 = new Customer(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                    repository.addCustomer(customer1);
                    break;
                } else {
                    display();
                    throw new IdAvailable();
                }
            } catch (IdAvailable e) {
                System.out.println("ID already exist");
            }
        }
        while (true);
    }

    @Override
    public void editCustomer() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdCustomer(id));
            Regex.validateIdCustomer(id);
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    String arr[] = checkInformation();
                    Customer customer1 = new Customer(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                    repository.editCustomer(id, customer1);
                    break;
                } else {
                    throw new IdNotFound();
                }
            } catch (IdNotFound e) {
                System.out.println("not found.");
            }
        } while (true);
    }

    @Override
    public void deleteCustomer() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdCustomer(id));
            do {
                Regex.validateIdCustomer(id);
                int index = repository.searchIndex(id);
                try {
                    if (index != -1) {
                        System.out.println("do you want to delete ?? " + "\n yes" + "\n no");
                        String confirm = scanner.nextLine().trim();
                        if (Objects.equals(confirm, "yes")) {
                            repository.deleteCustomer(id);
                            break;
                        } else {
                            System.out.println("cancel");
                            break;
                        }
                    } else {
                        throw new IdNotFound();
                    }
                } catch (IdNotFound e) {
                    System.out.println("not found");
                }
            } while (true);
        } while (true);
    }

    @Override
    public void searchCustomer() {
        String name;
        do {
            System.out.println("enter name");
            name = scanner.nextLine();
        } while (!Regex.validateName(name));
        Regex.validateName("enter email");
        List<Customer> customerList = repository.searchCustomer(name);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(name)) {
                customerList.add(customerList.get(i));
            }
        }
    }
}