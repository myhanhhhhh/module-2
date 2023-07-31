package case_study.controller;

import case_study.service.FaclityService;
import case_study.service.IFaclityService;
import static case_study.controller.FuramaController.scanner;

public class FacilityController {
    public static IFaclityService service = (IFaclityService) new FaclityService();

    public static void showMenu2() {
        int option;
        boolean flag = true;
        do {
            System.out.println("Facility Management");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility mainternance");
            System.out.println("4. Delete facility");
            System.out.println("5.Return main menu");
            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:

            }
        } while (true);
    }


}
