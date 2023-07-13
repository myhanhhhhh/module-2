package ss9.exercises.repository;

import ss9.exercises.model.Customer;

public class CustomerRepository implements ICustomerRepository {
    private static Customer[] customerlist = new Customer[3];
    private int size = 0;

    static {
        customerlist[0] = new Customer(1, "A", 10, "nho");
        customerlist[1] = new Customer(2, "B", 20, "nho");
        customerlist[2] = new Customer(3, "C", 30, "lon");
    }


    @Override
    public Customer[] display() {
        Customer[] customers = new Customer[size];
        for (int i = 0; i < size; i++) {
            customers[i] = customerlist[i];
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerlist[size] = customer;
        size++;
    }

    @Override
    public void deleteCustomer(Customer Customer) {

    }
}
