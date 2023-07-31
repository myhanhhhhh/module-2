package case_study.model.person;

import java.util.Date;

public class Employee extends Person {
    private String idEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private int salaryEmployee;

    public Employee(String idEmployee, String levelEmployee, String positionEmployee, int salaryEmployee) {
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public Employee(String idEmployee, String name, String dateOfBirth, String gender, String identity, String phoneNumber, String email, String levelEmployee, String positionEmployee, int salaryEmployee) {
        super(name, dateOfBirth, gender, identity, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String getIntoCsv() {
        return this.idEmployee + "," + this.getName() + "," + this.getDateOfBirth() + "," + this.getGender() + "," + this.getIndentity() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.levelEmployee + "," + this.positionEmployee + "," + this.salaryEmployee;
    }

    @Override
    public String toString() {
        return "employee{" +
                "idEmployee=" + idEmployee +
                ",name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", indentity=" + getIndentity() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee=" + salaryEmployee +
                '}';
    }
}