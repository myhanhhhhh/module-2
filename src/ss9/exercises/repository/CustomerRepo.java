package ss9.exercises.repository;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;
import ss9.exercises.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static ArrayList<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Hanh", 20, "vang"));
        customerList.add(new Customer(1, "Lien", 20, "kim cuongng"));
        customerList.add(new Customer(1, "Viet", 25, "vang"));
        customerList.add(new Customer(1, "Hau", 19, "bac"));

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
    public List<Customer> searchCustomer(String customer) {
        List<Customer> customerSearchList = display();
        return customerSearchList;
    }
}
