package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> display();

    void addCustomer(Customer customer);

    void editCustomer(String id, Customer customer);

    void deleteCustomer(String id);

    List<Customer> searchCustomer(String name);
    int searchIndex(String id);
}
