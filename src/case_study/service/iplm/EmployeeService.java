package case_study.service;

import case_study.common.IdAvailable;
import case_study.common.IdNotFound;
import case_study.common.Regex;
import case_study.model.person.Employee;
import case_study.repository.EmployeeRepo;
import case_study.repository.IEmployeeRepo;

import java.util.List;
import java.util.Objects;

import static case_study.controller.FuramaController.scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepo repository = new EmployeeRepo();

    public static String[] inputAndCheckData() {
        String name;
        do {
            System.out.println("enter name");
            name = scanner.nextLine();
        } while (!Regex.validateName(name));
        String dateOfBirth;
        do {
            System.out.println("enter dateOfBirth");
            dateOfBirth = scanner.nextLine();
        } while (!Regex.validateDateOfBirth(dateOfBirth));
        System.out.println("enter gender");
        String gender = scanner.nextLine();
        String identity;
        do {
            System.out.println("enter identity");
            identity = scanner.nextLine();
        } while (!Regex.validateIdentity(identity));
        String phoneNumber;
        do {
            System.out.println("enter phoneNumber");
            phoneNumber = scanner.nextLine();
        } while (!Regex.validatePhoneNumber(phoneNumber));
        System.out.println("enter email");
        String email = scanner.nextLine();
        String level = Regex.checkLevelEmployee();
        System.out.println("enter position");
        String position = scanner.nextLine();
        int salary = Regex.ValidateSalaryEmployee();
        String array[] = {name, dateOfBirth, gender, identity, phoneNumber, email, level, position, String.valueOf(salary)};
        return array;
    }

    @Override

    public void display() {
        List<Employee> employeeList = repository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdEmployee(id));
            int index = repository.searchIndex(id);
            try {
                if (index == -1) {
                    String array[] = inputAndCheckData();
                    Employee employee = new Employee(id, array[0], array[1], array[2], array[3], array[4], array[5],
                            array[6], array[7], Integer.parseInt(array[8]));
                    repository.addEmployee(employee);
                    break;
                } else {
                    display();
                    throw new IdAvailable();
                }
            } catch (IdAvailable e) {
                System.out.println("ID already exist");
            }
        } while (true);
    }

    @Override
    public void editEmployee() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdEmployee(id));
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    String employeeData[] = inputAndCheckData();
                    Employee employee = new Employee(id, employeeData[0], employeeData[1], employeeData[2], employeeData[3], employeeData[4], employeeData[5], employeeData[6], employeeData[7], Integer.parseInt(employeeData[8]));
                    repository.editEmployee(id, employee);
                    break;
                } else {
                    throw new IdNotFound();
                }
            } catch (IdNotFound e) {
                System.out.println("not found");
            }
        } while (true);

    }

    @Override
    public void deleteEmployee() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdEmployee(id));
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    System.out.println("do you want to delete" + "\n yes" + "\n no");
                    String confirm = scanner.nextLine().trim();
                    if (Objects.equals(confirm, "yes")) {
                        repository.deleteEmployee(id);
                        break;
                    } else {
                        System.out.println("cancel");
                        break;
                    }
                } else {
                    throw new IdNotFound();
                }
            } catch (IdNotFound e) {
                System.out.println("not found");
            }
        } while (true);
    }

    @Override
    public void searchEmployee() {
        String name;
            System.out.println("enter name");
            name = scanner.nextLine();
        List<Employee> employeeSearchList = repository.searchEmployee(name);
        for (int i = 0; i < employeeSearchList.size(); i++) {
            if (employeeSearchList.get(i).getName().contains(name)) {
                System.out.println(employeeSearchList.get(i));
            }
        }
    }
}
