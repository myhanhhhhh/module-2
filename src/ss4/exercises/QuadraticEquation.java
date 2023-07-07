package ss4.exercises;

import java.util.Scanner;

public class QuadraticEquation {
   private double a;
   private double b;
   private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return -this.b + Math.sqrt(this.getDiscriminant()) / 2 * this.a;
    }

    public double getRoot2() {
        return -this.b - Math.sqrt(this.getDiscriminant()) / 2 * this.a;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 13, 3);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println( " 2 nghiem " + quadraticEquation.getRoot1() + " va " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println( " 1 nghiem "+ quadraticEquation.getRoot1());
        } else {
            System.out.println("Chuong trinh khong co nghiem");
        }
    }
}
