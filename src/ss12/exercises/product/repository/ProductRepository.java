package ss12.exercises.product.repository;

import ss12.exercises.product.model.Product;
import ss12.exercises.product.model.SortUpProduct;
import ss12.exercises.product.model.SortDownProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "iphone", 5000));
        productList.add(new Product(2, "samsung", 3000));
        productList.add(new Product(3, "nokia", 4000));
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
    public void removeProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
                break;
            }
        }
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> productSearchList = display();
        return productSearchList;
    }

    @Override
    public List<Product> sortUpProduct() {
        List<Product> sortedProductList = new ArrayList<>(productList);
        productList.sort(new SortUpProduct());
        return sortedProductList;
    }

    @Override
    public List<Product> sortDownProduct() {
        List<Product> sortedProductList = new ArrayList<>(productList);
        sortedProductList.sort(new SortDownProduct());
        return sortedProductList;
    }
}
