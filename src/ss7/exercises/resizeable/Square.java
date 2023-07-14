package ss7.exercises.resizeable;

public class Square extends Shape implements Resizeable {
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

    @Override
    public void resize(double percent) {
        setSide(this.side *= Math.sqrt(percent + 1));
    }
}
