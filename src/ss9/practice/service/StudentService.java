package ss9.practice.service;

import org.omg.CORBA.PRIVATE_MEMBER;
import ss9.practice.model.Student;
import ss9.practice.repository.IStudentRepo;
import ss9.practice.repository.StudentRepo;

import static ss9.practice.controller.StudentController.scanner;


public class StudentService implements IStudentService {
    private IStudentRepo repository = new StudentRepo();

    @Override
    public void findall() {
        for(Student student: repository.findall()){
            System.out.println(student);
        }
    }

    @Override
    public void addStudent() {
        System.out.println("enter id");
        int enterId = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        Student student = new Student(enterId, enterName);
        repository.addStudent(student);
    }
}
