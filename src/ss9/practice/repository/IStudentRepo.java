package ss9.practice.repository;

import ss9.practice.model.Student;

public interface IStudentRepo {
    Student []findall();
    void addStudent(Student student);
}
