package ss7.exercises.resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, String color, boolean fillied) {
        super(color, fillied);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return " Circle{" +
                "radius=" + radius +
                " lop con cua " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(this.radius *= Math.sqrt(percent + 1));
    }

}
