package ss16.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(filePath);
            buff = new BufferedReader(new BufferedReader(fileReader));
            String line = "";
            while ((line = buff.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            buff.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(max);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
