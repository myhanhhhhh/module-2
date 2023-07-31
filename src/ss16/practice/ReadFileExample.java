package ss16.practice;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        FileReader fileReader = null;
        BufferedReader buff = null;
        try {
            fileReader = new FileReader(filePath);
            buff = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = buff.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            buff.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong dan file");
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
