package ss9.exercises.repository;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;
import ss9.exercises.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static ArrayList<Customer> customerList = new ArrayList<>();


    static {
        Customer customer1 = new Customer(1, "Hanh", 20, "vang");
        Customer customer2 = new Customer(2, "Lien", 20, "kim cuong");
        Customer customer3 = new Customer(3, "Viet", 25, "bac");
        Customer customer4 = new Customer(4, "Hau", 19, "bac");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.size();
    }

    @Override
    public List<Customer> display() {
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void removeCustomer(int Customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (Customer == customerList.get(i).getId()) {
                customerList.remove(customerList.get(i));
            }
        }
    }

    @Override
    public void searchCustomer(String customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(customer)) {
                System.out.println(customerList.get(i));
            }
        }
    }

}
