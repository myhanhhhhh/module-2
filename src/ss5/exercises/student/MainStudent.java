package ss5.exercises.student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten vao di");
        String name = scanner.nextLine();
        System.out.println("nhap lop vao di");
        String classes = scanner.nextLine();
        Student student = new Student();
        student.setName(name);
        student.setClasses(classes);
        System.out.println(student.toString());
    }
}
