package ss17.exercises.product.repository;

import ss17.exercises.product.model.Product;
import ss17.exercises.product.util_character.ReadAndWrite;
import ss9.exercises.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private final String FILE_PATH = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/ss17/exercises/product/data/product.csv";

    @Override
    public List<Product> display() {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        List<Product> productList = new ArrayList<>();
        String array[];
        for (String string : strings) {
            array = string.split(",");
            productList.add(new Product(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4]));
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<String> strings = ReadAndWrite.readFile(FILE_PATH);
        strings.add(product.getIntoCsv());
        ReadAndWrite.writeFile(FILE_PATH, strings, false);
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> productSearchList = display();
        return productSearchList;
    }
}
