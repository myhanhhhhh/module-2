package case_study.model.person;

import java.util.Date;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String indentity;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String indentity, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.indentity = indentity;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndentity() {
        return indentity;
    }

    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntoCsv() {
        return this.getName() + "," + this.getDateOfBirth() + "," + this.getGender() + "," + this.getIndentity() + "," + this.getPhoneNumber() + "," + this.getEmail();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", indentity=" + indentity +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
