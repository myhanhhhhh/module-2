package ss7.exercises.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[1];
        shape[0] = new Square(1,"red",true);
        for (Shape shape1 : shape){
            shape1.howToColor();
        }
    }
}
