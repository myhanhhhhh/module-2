package ss4.exercises;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import javax.jws.soap.SOAPBinding;

public class Demo {
    private String x;

    public Demo() {
        this("hello");
    }

    public Demo(String x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Demo demo = new Demo("hanh");
        Demo demo1 = new Demo();
        System.out.println(demo.x);
        System.out.println(demo1.x);
    }
}
