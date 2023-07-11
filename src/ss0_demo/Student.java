package ss0_demo;

public class Student extends Person {
    @Override
    public void diChuyen() {
        System.out.println("sinh vien di bang xe may");
    }

    public void hoc() {
        System.out.println("sin vien dang hoc mon lap trinh");
    }

    public void hoc(String monHoc) {
        System.out.println("sinh vien hoc mon: " + monHoc);
    }
}
