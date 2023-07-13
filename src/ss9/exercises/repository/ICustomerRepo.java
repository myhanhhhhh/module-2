package ss9.exercises.repository;

import ss9.exercises.model.Customer;

public interface ICustomerRepository {
    Customer[] display();
    void addCustomer(Customer customer);
    void  deleteCustomer(Customer Customer);

}
