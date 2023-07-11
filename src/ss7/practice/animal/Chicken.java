package ss7.practice.animal;
import ss7.practice.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cuktak Cuktak";
    }

    @Override
    public void howToEat() {
        System.out.println("Fried");
    }
}
