package ss17.exercises.product.controller;
import ss17.exercises.product.service.IProductService;
import ss17.exercises.product.service.ProductService;
import static ss17.exercises.product.view.View.scanner;
public class ProductController {
    public static IProductService service = new ProductService();

    public static void showMenu() {
        int option;
        do {
            System.out.println("----Product Manager----");
            System.out.println("1. List Product");
            System.out.println("2. Add Product");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.println("Enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addProduct();
                    break;
                case 3:
                    service.searchProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}

