package ss9.practice.controller;

import ss9.practice.model.Student;
import ss9.practice.service.IStudentService;
import ss9.practice.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);
    private static IStudentService service = new StudentService();

    public static void main(String[] args) {

        int select = 0;
        do {
            System.out.println("Student Manager");
            System.out.println("1.list student");
            System.out.println("2.create");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("9.exit");
            System.out.println("enter number");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("list");
                    service.findall();
                    break;
                case 2:
                    service.addStudent();
                    break;
                case 9:
                    System.exit(0);
            }
        } while (true);
    }
}
