package ss_02.repository;

import ss17.exercises.product.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getAll();

    void addProduct(Product product);

    void editProduct(String id, Product product);

    void deleteProduct(String id);
    List<Product> searchProduct(String name);
    int searchIndex(String  id);
}
