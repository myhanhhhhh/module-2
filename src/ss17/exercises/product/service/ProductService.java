package ss17.exercises.product.service;

import ss17.exercises.product.model.Product;
import ss17.exercises.product.repository.IProductRepo;
import ss17.exercises.product.repository.ProductRepo;

import java.util.List;

import static ss17.exercises.product.view.View.scanner;

public class ProductService implements IProductService {

    private IProductRepo repository = new ProductRepo();


    @Override
    public void display() {
        List<Product> productList = repository.display();
        for (Product product : productList) {
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
        System.out.println("enter company");
        String enterCompany = scanner.nextLine();
        System.out.println("enter description");
        String enterDescription = scanner.nextLine();
        Product product = new Product(enterId, enterName, enterPrice, enterCompany, enterDescription);
        repository.addProduct(product);
    }

    @Override
    public void searchProduct() {
        System.out.println("enter name");
        String enterName = scanner.nextLine();
        List<Product> productSearchList = repository.searchProduct(enterName);
        for (int i = 0; i < productSearchList.size(); i++) {
            if (productSearchList.get(i).getName().contains(enterName)) {
                System.out.println(productSearchList.get(i));
            }
        }
    }
}
