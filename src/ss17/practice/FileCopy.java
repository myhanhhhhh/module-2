package ss17.practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopy {
    private static void copyFileUsingJava(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        inputStream = new FileInputStream(source);
        outputStream = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int lenght;
        while ((lenght = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, lenght);
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("nhap file");
        String sourcePath = scanner.nextLine();
        System.out.println("nhap file dich");
        String destPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
    }
}
