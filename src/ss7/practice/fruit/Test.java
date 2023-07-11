package ss7.practice.fruit;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit value : fruits) {
            if (value instanceof Apple) {
                ((Apple) value).howToEat();
            }
            if (value instanceof Orange) {
                ((Orange) value).howToEat();
            }
        }
    }
}