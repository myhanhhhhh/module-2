package ss0_demo;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.hoc();// xac dinh duoc method @AAZZA@A@Z@AZ@AZp/. chay
        student.hoc("Toan"); //overloading
        Person person = new Student();// ep  kieu 3ngam dinh
        person.diChuyen();// tai complier goi cua cha, nhung runtime goi con
        ((Student)person).hoc();// ep kieu tuong minh
    }
}