package ss10.exercises;

import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(59);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        list.remove(0);
        list.add(11);
        System.out.println(list.get(5));
        list.add(15,2);
        for (int i = 0; i < list.size ; i++) {
            System.out.println(list.get(i));
        }
    }
}
