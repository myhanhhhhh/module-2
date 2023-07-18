package ss12.exercises.product.repository;

import ss12.exercises.product.model.Product;
import ss12.exercises.product.model.SortUpProduct;
import ss12.exercises.product.model.SortDownProduct;

import java.util.ArrayList;
import java.util.List;

public class PoductRepository implements IProductRepository {
    static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "iphone", 5000));
        productList.add(new Product(2, "samsung", 4000));
        productList.add(new Product(3, "nokia", 3000));
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void removeProduct(int product) {
        for (int i = 0; i < productList.size(); i++) {
            if (product == productList.get(i).getId()) {
                productList.remove(productList.get(i));
                break;
            }
        }
    }

    @Override
    public List<Product> searchProduct(String prodcut) {
        List<Product> productSearchList = display();
        return productSearchList;
    }

    @Override
    public void sortUpProduct() {
        productList.sort(new SortUpProduct());
    }

    @Override
    public void sortDownProduct() {
        productList.sort(new SortDownProduct());
    }
}
