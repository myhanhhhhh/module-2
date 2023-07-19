package ss12.exercises.product.service;

import ss12.exercises.product.model.Product;
import ss12.exercises.product.repository.IProductRepository;
import ss12.exercises.product.repository.ProductRepository;

import java.util.List;

import static ss9.practice.controller.StudentController.scanner;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void display() {
        for (Product product : repository.display()) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("enter id");
        int enterId = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        System.out.println("enter price");
        int enterPrice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(enterId, enterName, enterPrice);
        repository.addProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.println("enter id");
        int enterId = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        System.out.println("enter price");
        int enterPrice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(enterId, enterName, enterPrice);
        repository.editProduct(enterId, product);
    }

    @Override
    public void removeProduct() {
        System.out.println("enter ID");
        int enterId = Integer.parseInt(scanner.nextLine());
        repository.removeProduct(enterId);
    }

    @Override
    public void searchProduct() {
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        List<Product> productSearchList = repository.display();
        for (int i = 0; i < productSearchList.size(); i++) {
            if (productSearchList.get(i).getName().contains(enterName)) {
                System.out.println(productSearchList.get(i));
            }
        }
    }

    @Override
    public void sortUpProduct() {
        for (Product product : repository.sortDownProduct()) {
            System.out.println(product);
        }
    }

    @Override
    public void sortDownProduct() {
        for (Product product : repository.sortDownProduct()) {
            System.out.println(product);
        }
    }

}