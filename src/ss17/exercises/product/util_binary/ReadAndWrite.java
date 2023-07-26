package ss17.exercises.product.util_binary;

import ss17.exercises.product.model.Product;
import ss17.exercises.product.repository.ProductRepo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String FILE_PATH = "src/ss17/exercises/product/utils/list.dat";

    public static void writeObjectList(List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
        }
    }

    public static List<Product> readOject() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
