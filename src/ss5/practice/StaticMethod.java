package ss5.practice;

import com.sun.org.apache.xpath.internal.objects.XString;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public StaticMethod(int rollno, String name) {
        this.rollno =  rollno;
        this.name = name;
    }
    static void change(){
        college ="CODEGYM";
    }
    void display (){
        System.out.println(rollno + " " + name + college);
    }

}
