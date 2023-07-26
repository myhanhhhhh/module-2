package ss17.exercises.product.repository;

import ss17.exercises.product.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> display();

    void addProduct(Product product);

    List<Product> searchProduct(String name);

}
