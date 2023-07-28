package case_study.service.class_service;

import case_study.common.Regex;
import case_study.model.person.Customer;
import case_study.repository.class_repository.CustomerRepo;
import case_study.repository.interface_repository.ICustomerRepo;
import case_study.service.interface_service.ICustomerService;

import java.util.List;

import static case_study.controller.FuramaController.scanner;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();

    public static String[] checkInformation() {
        String name = Regex.validateName();
        String dateOfBirth = Regex.validateDateOfBirth();
        System.out.println("enter gender");
        String gender = scanner.nextLine();
        String identity = Regex.validateIdentity();
        String phoneNumber = Regex.validatePhoneNumber();
        System.out.println("enter email");
        String email = scanner.nextLine();
        System.out.println("enter cutomerType");
        String cutomerType = scanner.nextLine();
        System.out.println("enter address");
        String address = scanner.nextLine();
        String array[] = {name, dateOfBirth, gender, identity, phoneNumber, email, cutomerType, address};
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
        String id = Regex.validateIdCustomer();
        String arr[] = checkInformation();
        Customer customer1 = new Customer(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
        repository.addCustomer(customer1);
    }

    @Override
    public void editCustomer() {
        String idCustomer = Regex.validateIdCustomer();
        String arr[] = checkInformation();
        Customer customer1 = new Customer(idCustomer, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
        repository.editCustomer(idCustomer,customer1);
    }

    @Override
    public void deleteCustomer() {
        String idCustomer = Regex.validateIdCustomer();
        repository.deleteCustomer(idCustomer);
    }

    @Override
    public void searchCustomer() {
        String nameCustomer = Regex.validateName();
        List<Customer> customerList = repository.searchCustomer(nameCustomer);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(nameCustomer)) {
                customerList.add(customerList.get(i));
            }
        }
    }
}
