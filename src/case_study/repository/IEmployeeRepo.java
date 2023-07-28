package case_study.repository.interface_repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepo {
    List<Employee> display();

    void addEmployee(Employee employee);

    void editEmployee(String id, Employee employee);

    void deleteEmployee(String id);

    List<Employee> searchEmployee(String name);
}
