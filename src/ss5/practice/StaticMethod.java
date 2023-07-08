package ss5.practice;

import com.sun.org.apache.xpath.internal.objects.XString;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public StaticMethod(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111, "Hanh");
        StaticMethod s2 = new StaticMethod(222, "Duong");
        StaticMethod s3 = new StaticMethod(333, "Tam");
        s1.display();
        s2.display();
        s3.display();
    }
}
