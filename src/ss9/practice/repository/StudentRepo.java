package ss9.practice.repository;

import ss9.practice.model.Student;

import java.util.Scanner;

public class StudentRepo implements IStudentRepo {
    private static Student[] studentList = new Student[5];
    private static int size = 0;

    static {
        studentList[0] = new Student(1, "A");
        studentList[1] = new Student(2, "B");
        studentList[2] = new Student(3, "C");
        studentList[3] = new Student(4, "D");
        size = 4;
    }

    @Override
    public Student[] findall() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList[size] = student;
        size++;
    }
}

