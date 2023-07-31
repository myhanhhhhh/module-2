package ss12.exercises.product.repository;

import ss12.exercises.product.model.Product;
import ss9.exercises.model.Customer;

import java.util.List;

public interface IProductRepository {

    List<Product> display();

    void addProduct(Product product);

    void editProduct(int id, Product product);

    void removeProduct(int id);

    List<Product> searchProduct(String name);

    List<Product> sortUpProduct();

    List<Product> sortDownProduct();

}
