package ss12.exercises.tree_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        String string = "Everytime i look at my parents, i give myself a million reasons to be successfull";
        String value = string.toLowerCase();
        String arr[] = value.split(" ");
        System.out.println(Arrays.toString(arr));
        for (String element : arr) {
            if (myMap.containsKey(element)) {
                myMap.put(element, myMap.get(element) + 1);
            } else {
                myMap.put(element, 1);
            }
        }
        for (Map.Entry<String, Integer> element : myMap.entrySet()) {
            System.out.println("tu " + element.getKey() + " xuat hien " + element.getValue() + " lan");
        }
    }
}
