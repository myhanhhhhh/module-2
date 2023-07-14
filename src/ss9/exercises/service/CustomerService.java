package ss9.exercises.service;

import ss9.exercises.model.Customer;
import ss9.exercises.repository.CustomerRepo;
import ss9.exercises.repository.ICustomerRepo;

import static ss9.practice.controller.StudentController.scanner;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();

    @Override
    public void display() {
        for (Customer customer : repository.display()) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        System.out.println("enter id");
        int enterId = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        System.out.println("enter age");
        int enterAge = Integer.parseInt(scanner.nextLine());
        System.out.println("enter type");
        String enterType = scanner.nextLine();
        Customer customer = new Customer(enterId, enterName, enterAge, enterType);
        repository.addCustomer(customer);
    }

    @Override
    public void removeCustomer() {
        System.out.println("enter ID, you want to remove");
        int enterId = Integer.parseInt(scanner.nextLine());
        repository.removeCustomer(enterId);
    }

    @Override
    public void searchCustomer() {
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        repository.searchCustomer(enterName);
    }
}

