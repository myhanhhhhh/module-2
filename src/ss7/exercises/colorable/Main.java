package ss7.exercises.colorable;

public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[1];
        shape[0] = new Square(1,"red",true);
        for (Shape shape1 : shape){
            if(shape1 instanceof Square){
                ((Square)shape1).howToColor();
            }
        }
    }
}
