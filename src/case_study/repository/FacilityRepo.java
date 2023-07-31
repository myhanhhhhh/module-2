package case_study.repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    static Map<Facility, Integer> villa = new LinkedHashMap<>();
    static Map<Facility, Integer> house = new LinkedHashMap<>();
    static Map<Facility, Integer> room = new LinkedHashMap<>();

    static {
        Facility villa1 = new Villa("SVVL-0001", "Family Village", 500, 1000, 4, "day", "Deluxe", 100, 2);
        Facility villa2 = new Villa("SVVL-0002", "Family Village", 600, 2000, 4, "day", "Standard", 100, 3);
        Facility house1 = new House("SVHO-0001", "Family Village", 600, 2000, 4, "day", "Superior", 3);
        Facility house2 = new House("SVHO-0002", "Family Village", 600, 2000, 4, "day", "Deluxe", 4);
        Facility room1 = new Room("ROHO-0002", "Family Village", 600, 2000, 4, "day", "spa");
        Facility room2 = new Room("ROHO-0002", "Family Village", 600, 2000, 4, "day", "spa");
        villa.put(villa1, 3);
        villa.put(villa2, 3);
        house.put(house1, 2);
        house.put(house2, 3);
        room.put(room1, 4);
        room.put(room2, 3);
    }

    @Override
    public Map<Facility, Integer> display(int option) {
        switch (option) {
            case 1:
                return villa;
            case 2:
                return house;
            case 3:
                return room;
            default:
                return null;
        }
    }

    @Override
    public void addFacility(int option, Facility facility) {
        switch (option) {
            case 1:
                villa.put(facility, 1);
            case 2:
                house.put(facility, 1);
            case 3:
                room.put(facility, 1);
            case 4:

        }
    }

    @Override
    public String searchIndex(int option, String id) {
        return null;
    }

    @Override
    public void displayMaintance() {

    }
}
