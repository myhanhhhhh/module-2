package ss12.exercises.product.controller;

import ss12.exercises.product.service.IProductService;
import ss12.exercises.product.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    private static IProductService service = new ProductService();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("-----Product Manager------");
            System.out.println("1.list Product");
            System.out.println("2.Create");
            System.out.println("3.Edit");
            System.out.println("4.Remove");
            System.out.println("5.Search");
            System.out.println("6.Sort Up");
            System.out.println("7.Sort Down");
            System.out.println("8.Exit");
            System.out.println("enter number");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.addProduct();
                    break;
                case 3:
                    service.editProduct();
                    break;
                case 4:
                    service.removeProduct();
                    break;
                case 5:
                    service.searchProduct();
                    break;
                case 6:
                    service.sortUpProduct();
                    break;
                case 7:
                    service.sortDownProduct();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }
}

