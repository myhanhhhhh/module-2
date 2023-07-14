package ss9.exercises.repository;

import ss9.exercises.model.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> display();

    void addCustomer(Customer customer);

    void removeCustomer(int customer);
    void searchCustomer(String customer);


}
