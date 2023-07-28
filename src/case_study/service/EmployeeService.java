package case_study.service.class_service;

import case_study.common.Regex;
import case_study.model.person.Employee;
import case_study.repository.class_repository.EmployeeRepo;
import case_study.repository.interface_repository.IEmployeeRepo;
import case_study.service.interface_service.IEmployeeService;
import ss17.exercises.product.view.View;
import ss9.practice.controller.StudentController;

import java.util.List;

import static case_study.controller.FuramaController.scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepo repository = new EmployeeRepo();

    @Override

    public void display() {
        List<Employee> employeeList = repository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static String[] checkInformation() {
        String name = Regex.validateName();
        String dateOfBirth = Regex.validateDateOfBirth();
        System.out.println("enter gender");
        String gender = scanner.nextLine();
        String identity = Regex.validateIdentity();
        String phoneNumber = Regex.validatePhoneNumber();
        System.out.println("enter email");
        String email = scanner.nextLine();
        System.out.println("enter level");
        String level = scanner.nextLine();
        System.out.println("enter position");
        String position = scanner.nextLine();
        String salary = Regex.ValidateSalaryEmployee();
        String array[] = {name, dateOfBirth, gender, identity, phoneNumber, email, level, position, salary};
        return array;
    }

    @Override
    public void addEmployee() {
        String id = Regex.validateIdEmployee();
        String array[] = checkInformation();
        Employee employee = new Employee(id, array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
        repository.addEmployee(employee);
    }

    @Override
    public void editEmployee() {
        String id = Regex.validateIdEmployee();
        String array[] = checkInformation();
        Employee employee = new Employee(id, array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
        repository.editEmployee(id, employee);
    }

    @Override
    public void deleteEmployee() {
        String id = Regex.validateIdEmployee();
        repository.deleteEmployee(id);
    }

    @Override
    public void searchEmployee() {
        String name = Regex.validateName();
        List<Employee> employeeSearchList = repository.searchEmployee(name);
        for (int i = 0; i < employeeSearchList.size(); i++) {
            if (employeeSearchList.get(i).getName().contains(name)) {
                System.out.println(employeeSearchList.get(i));
            }
        }
    }
}
