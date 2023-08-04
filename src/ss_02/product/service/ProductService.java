package ss_02.product.service;

import ss_02.product.common.IdAvailable;
import ss_02.product.common.IdNotFound;
import ss_02.product.common.Validate;
import ss_02.product.model.Product;
import ss_02.product.repository.IProductRepo;
import ss_02.product.repository.ProductRepo;

import java.util.List;

import static ss_02.product.view.View.scanner;

public class ProductService implements IProductService {
    private IProductRepo repository = new ProductRepo();

    public static String[] inputAndCheckData() {
        String name;
        System.out.println("enter name");
        do {
            name = scanner.nextLine();
        } while (!Validate.validateName(name));
        System.out.println("enter price");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("enter company");
        String company = scanner.nextLine();
        System.out.println("enter description");
        String description = scanner.nextLine();
        String productData[] = {name, String.valueOf(price), company, description};
        return productData;
    }

    @Override
    public void getAll() {
        List<Product> productList = repository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        do {
            System.out.println("enter ID");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Validate.validateId(id));
            int index = repository.searchIndex(id);
            try {
                if (index == -1) {
                    String productData[] = inputAndCheckData();
                    Product product = new Product(id, productData[0], Double.parseDouble(productData[1]), productData[2],
                            productData[3]);
                    repository.addProduct(product);
                    break;
                } else {
                    throw new IdAvailable();
                }
            } catch (IdAvailable e) {
                System.out.println("ID already exist");
            }
        } while (true);
    }

    @Override
    public void editProduct() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Validate.validateId(id));
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    String productData[] = inputAndCheckData();
                    Product product = new Product(id, productData[0], Double.parseDouble(productData[1]), productData[2],
                            productData[3]);
                    repository.editProduct(id, product);
                    break;
                } else {
                    throw new IdNotFound();
                }
            } catch (IdNotFound e) {
                System.out.println("not found");
            }
        } while (true);
    }

    @Override
    public void deleteProduct() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Validate.validateId(id));
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    System.out.println("do you want to delete ? " + "\n yes" + "\n no");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("yes")) {
                        repository.deleteProduct(id);
                        break;
                    } else {
                        System.out.println("cancel");
                        break;
                    }
                } else {
                    throw new IdNotFound();
                }
            } catch (IdNotFound e) {
                System.out.println("not found");
            }
        } while (true);
    }
    @Override
    public void searchProduct() {
        System.out.println("enter name");
        String name = scanner.nextLine();
        List<Product> productList = repository.searchProduct(name);
        if (productList.size() == 0) {
            System.out.println("not found");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}
