package ss16.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> read(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            while ((line = buff.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void write(List<String> file, String newFile) {
        try {
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            int num = 0;
            while (num < file.size()) {
                buff.write(file.get(num));
                buff.newLine();
                num++;
            }
            buff.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String inputFile = "/Users/myhanh/IdeaProjects/module-2/module-2/src/ss16/exercises/source.txt";
        String ouputFile = "/Users/myhanh/IdeaProjects/module-2/module-2/src/ss16/exercises/target.txt";
        read(inputFile);
        write(read(inputFile),ouputFile);
    }
}
