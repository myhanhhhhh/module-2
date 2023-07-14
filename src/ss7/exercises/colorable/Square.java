package ss7.exercises.colorable;

public class Square extends Shape implements Colorable {
    double side;

    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return " Square{" +
                "side=" + side +
                " lop con cua " + super.toString() +
                '}';
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
