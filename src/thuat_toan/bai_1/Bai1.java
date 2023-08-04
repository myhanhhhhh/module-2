package thuat_toan.bai_1;

import java.util.ArrayList;
import java.util.List;

public class Exe1 {
    public static boolean checkNumber() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int arr[] = {4, 3, 2, 1, 4, 2, 3, 1, };
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        boolean flag = true;
        for (int i = 0; i < list1.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) == list1.get(j)) {
                    count++;
                    list1.remove(i);
                    j--;
                }
            }
            list2.add(count);
        }
        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(i) == list2.get(j)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
