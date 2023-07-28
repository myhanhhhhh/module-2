package case_study.repository.class_repository;

import case_study.model.person.Customer;
import case_study.repository.interface_repository.ICustomerRepo;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    public static final String FILE_PATH = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/data/customer.csv";

    @Override
    public List<Customer> display() {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        List<Customer> customerList = new ArrayList<>();
        String arr[];
        for (String string : strings) {
            arr = string.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        strings.add(customer.getIntoCsv());
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = this.display();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(id)) {
                customerList.set(i, customer);
                break;
            }
        }
        for (Customer customer1 : customerList) {
            strings.add(customer1.getIntoCsv());
        }
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public void deleteCustomer(String id) {
        List<String> strings = new ArrayList<>();
        List<Customer> customerList = this.display();
        for (int i = 0; i < customerList.size(); i++) {
            do {
                if (!customerList.get(i).getIdCustomer().equals(id)) {
                    System.out.println("please enter again");
                } else {
                    customerList.remove(customerList.get(i));
                    break;
                }
            } while (!customerList.get(i).getIdCustomer().equals(id));
        }
        for (Customer customer : customerList) {
            strings.add(customer.getIntoCsv());
        }
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }


    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = this.display();
        return customerList;
    }
}