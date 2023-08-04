package case_study.repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepo implements IEmployeeRepo {
    public final String FILE_PATH = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/case_study/data/employee.csv";


    @Override
    public List<Employee> display() {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String array[];
        for (String string : strings) {
            array = string.split(",");
            employeeList.add(new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8],Integer.parseInt(array[9])) );
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        strings.add(employee.getIntoCsv());
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public void editEmployee(String id, Employee employee) {
        List<String> strings = new ArrayList<>();
        List<Employee> employeeList = this.display();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(id)) {
                employeeList.set(i, employee);
                break;
            }
        }
        for (Employee employee1 : employeeList) {
            strings.add(employee1.getIntoCsv());
        }
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public void deleteEmployee(String id) {
        List<String> strings = new ArrayList<>();
        List<Employee> employeeList = this.display();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(id, employeeList.get(i).getIdEmployee())) {
                employeeList.remove(employeeList.get(i));
                break;
            }
        }
        for (Employee employee : employeeList) {
            strings.add(employee.getIntoCsv());
        }
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employeeSearchList = display();
        return employeeSearchList;
    }
    public int searchIndex(String id) {
        List<Employee> employeeList = display();
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(id, employeeList.get(i).getIdEmployee())) {
                return i;
            }
        }
        return -1;
    }

}
