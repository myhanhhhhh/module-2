package ss7.exercises.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "hinh chu nhat co chieu rong " + width + " va chieu dai" + height + " lop con cua :" + super.toString();
    }

    @Override
    public String toString() {
        return " Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        setHeight(this.height *= Math.sqrt(percent + 1));
        setWidth(this.width = (this.width/this.height) *this.height);
    }
}

