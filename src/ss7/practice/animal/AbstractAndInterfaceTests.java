package ss7.practice.animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals =  new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal value : animals){
            System.out.println(value.makeSound());
        }
    }
}
