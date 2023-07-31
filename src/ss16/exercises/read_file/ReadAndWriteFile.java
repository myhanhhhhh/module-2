package ss16.exercises.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String temp[];
            People peopleList;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                peopleList = new People(id, code, name);
                list.add(peopleList.getIntoCsv() + "\n");
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void writeFile(String path, List<String> stringList, boolean append) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String sourceFile = "/Users/myhanh/IdeaProjects/module-2/module-2/src/ss16/exercises/read_file/source.csv";
        String targetFile = "/Users/myhanh/IdeaProjects/module-2/module-2/src/ss16/exercises/read_file/target.csv";
        List<String> stringList = readFile(sourceFile);
        System.out.println(stringList);
        writeFile(targetFile, stringList, false);
    }
}

