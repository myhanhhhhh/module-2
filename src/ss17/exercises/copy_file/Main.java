package ss17.exercises.copy_file;

import ss17.exercises.copy_file.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String SOURCE_PATH = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/ss17/exercises/copy_file/source.dat";
    public static final String TARGET_PATH = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/ss17/exercises/copy_file/target.dat";

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("add gì vô đi ba");
        ReadAndWrite.writeObject(SOURCE_PATH, stringList);
        List<String> stringList1 = ReadAndWrite.readObject(SOURCE_PATH);
        ReadAndWrite.writeObject(TARGET_PATH, stringList);
        for (String str : stringList1) {
            System.out.println(str);
        }
    }
}