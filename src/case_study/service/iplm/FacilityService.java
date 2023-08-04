package case_study.service;

import case_study.common.IdAvailable;
import case_study.common.IdNotFound;
import case_study.common.Regex;
import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.FacilityRepo;
import case_study.repository.IFacilityRepo;

import java.util.Map;
import java.util.Objects;

import static case_study.controller.FuramaController.scanner;

public class FacilityService implements IFaclityService {
    private IFacilityRepo repository = new FacilityRepo();

    public static String[] checkInformation() {
        String serviceName;
        do {
            System.out.println("enter serviceName");
            serviceName = scanner.nextLine();
        } while (!Regex.validateName(serviceName));
        System.out.println("enter usableArea");
        double usableArea = Regex.checkUsableAreaAndPoolArea();
        double rentalCost = Regex.checkRentalCost();
        int maxPeople = Regex.checkMaxPeople();
        String rentalType;
        do {
            System.out.println("enter rentalType");
            rentalType = scanner.nextLine();
        } while (!Regex.validateRentalTypeAndKindOfRoom(rentalType));
        String array[] = {serviceName, String.valueOf(usableArea), String.valueOf(rentalCost), String.valueOf(maxPeople), rentalType};
        return array;
    }

    @Override
    public void display() {
        int option = 0;
        do {
            try {
                System.out.println("you wanna show list ?");
                System.out.println("1. Villa");
                System.out.println("2. House ");
                System.out.println("3. Room");
                System.out.println("Enter number");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("let enter number");
            }
        } while (option <= 0 || option > 3);
        Map<Facility, Integer> facilityIntegerMap = repository.display(option);
        for (Facility key : facilityIntegerMap.keySet()) {
            System.out.println(facilityIntegerMap.get(key));
        }
    }

    @Override
    public void addFacility() {
        int option = 0;
        do {
            try {
                System.out.println("you wanna add list ?");
                System.out.println("1. Villa");
                System.out.println("2. House ");
                System.out.println("3. Room");
                System.out.println("Enter number");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("let enter number");
            }
            switch (option) {
                case 1:
                    String id;
                    do {
                        System.out.println("enter id");
                        do {
                            id = scanner.nextLine();
                        } while (!Regex.validateIdVilla(id));
                        int index =repository.searchIndex(id);
                        try {
                            if (index == -1) {
                                String array[] = checkInformation();
                                String kindOfRoom;
                                do {
                                    System.out.println("enter kindOfRoom");
                                    kindOfRoom = scanner.nextLine();
                                } while (!Regex.validateRentalTypeAndKindOfRoom(kindOfRoom));
                                System.out.println("enter PoolArea");
                                double poolArea = Regex.checkUsableAreaAndPoolArea();
                                int numberOfFloor = Regex.checkNumberOfFloor();
                                Villa villa = new Villa(id, array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                                        Integer.parseInt(array[3]), array[4], kindOfRoom, Double.parseDouble(String.valueOf(poolArea)),
                                        Integer.parseInt(String.valueOf(numberOfFloor)));
                                repository.addFacility(option, villa);
                                break;
                            } else {
                                display();
                                throw new IdAvailable();
                            }
                        } catch (IdAvailable e) {
                            System.out.println("ID already exist");
                        }
                    } while (true);
                case 2:
                    do {
                        System.out.println("enter id");
                        do {
                            id = scanner.nextLine();
                        } while (!Regex.validateIdHouse(id));
                        Regex.validateIdHouse(id);
                        int index = repository.searchIndex(id);
                        try {
                            if (index == -1) {
                                String array[] = checkInformation();
                                String kindOfRoom;
                                do {
                                    System.out.println("enter kindOfRoom");
                                    kindOfRoom = scanner.nextLine();
                                } while (!Regex.validateRentalTypeAndKindOfRoom(kindOfRoom));
                                int numberOfFloor = Regex.checkNumberOfFloor();
                                House house = new House(id, array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                                        Integer.parseInt(array[3]), array[4], kindOfRoom, Integer.parseInt(String.valueOf(numberOfFloor)));
                                repository.addFacility(option, house);
                                break;
                            } else {
                                display();
                                throw new IdAvailable();
                            }
                        } catch (IdAvailable e) {
                            System.out.println("ID already exist");
                        }
                    } while (true);
                case 3:
                    do {
                        System.out.println("enter id");
                        do {
                            id = scanner.nextLine();
                        } while (!Regex.validateIdRoom(id));
                        int index = repository.searchIndex(id);
                        try {
                            if (index == -1) {
                                String array[] = checkInformation();
                                System.out.println("enter freeService");
                                String freeService = scanner.nextLine();
                                Room room = new Room(id, array[0], Double.parseDouble(array[1]), Double.parseDouble(array[2]),
                                        Integer.parseInt(array[3]), array[4], freeService);
                                repository.addFacility(option, room);
                                break;
                            } else {
                                throw new IdAvailable();
                            }
                        } catch (IdAvailable e) {
                            System.out.println("ID already exist");
                        }
                    } while (true);
            }
        } while (option <= 0 || option > 3);
    }

    @Override
    public void displayManternance() {

    }

    @Override
    public void deleteFacility() {
        do {
            System.out.println("enter id");
            String id;
            do {
                id = scanner.nextLine();
            } while (!Regex.validateIdVilla(id) && !Regex.validateIdHouse(id) && !Regex.validateIdRoom(id));
            int index = repository.searchIndex(id);
            try {
                if (index != -1) {
                    System.out.println("do you want to delete" + "\n yes" + "\n no");
                    String confirm = scanner.nextLine().trim();
                    if (Objects.equals(confirm, "yes")) {
                        repository.deleteFacility(id);
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
}
