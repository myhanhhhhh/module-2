package case_study.repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.utils.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    public final String FILE_PATH_VILLA = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/case_study/data/villa.csv";
    public final String FILE_PATH_HOUSE = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/case_study/data/house.csv";
    public final String FILE_PATH_ROOM = "/Users/myhanh/IdeaProjects/module-2/module-2 16.22.32/src/case_study/data/room.csv";
    static Map<Facility, Integer> villaMap = new LinkedHashMap<>();
    static Map<Facility, Integer> houseMap = new LinkedHashMap<>();
    static Map<Facility, Integer> roomMap = new LinkedHashMap<>();
    List<String> villaList = ReadAndWrite.readFile(FILE_PATH_VILLA);
    List<String> houseList = ReadAndWrite.readFile(FILE_PATH_HOUSE);
    List<String> roomList = ReadAndWrite.readFile(FILE_PATH_ROOM);

    @Override
    public Map<Facility, Integer> display(int option) {
        switch (option) {
            case 1:
                String arr[];
                for (String villa : villaList) {
                    arr = villa.split(",");
                    villaMap.put(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                            arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8])), 0);
                }
                return villaMap;

            case 2:
                String arr1[];
                for (String hosue : houseList) {
                    arr1 = hosue.split(",");
                    houseMap.put(new House(arr1[0], arr1[1], Double.parseDouble(arr1[2]), Double.parseDouble(arr1[3]),
                            Integer.parseInt(arr1[4]), arr1[5], arr1[6], Integer.parseInt(arr1[7])), 0);
                }
                return houseMap;
            case 3:
                String arr2[];
                for (String room : roomList) {
                    arr2 = room.split(";");
                    roomMap.put(new Room(arr2[0], arr2[1], Double.parseDouble(arr2[2]), Double.parseDouble(arr2[3]),
                            Integer.parseInt(arr2[4]), arr2[5], arr2[6]), 0);
                }
                return roomMap;
            default:
                return null;
        }
    }

    @Override
    public void addFacility(int option, Facility facility) {
        switch (option) {
            case 1:
                villaList.add(facility.getToCsv());
                ReadAndWrite.readFile(FILE_PATH_VILLA);
                break;
            case 2:
                houseList.add(facility.getToCsv());
                ReadAndWrite.readFile(FILE_PATH_HOUSE);
                break;
            case 3:
                roomList.add(facility.getToCsv());
                ReadAndWrite.readFile(FILE_PATH_ROOM);
                break;
            case 4:
        }
    }


    @Override
    public void displayMainternance() {

    }

    @Override
    public void deleteFacility(String id) {
        int option = 0;
        switch (option) {
            case 1:
                Map<Facility, Integer> villaMap = display(option);
                for (Facility key : villaMap.keySet()) {
                    if (key.getServiceId().equals(id)) {
                        villaMap.remove(villaMap.get(id));
                        break;
                    }
                }
            case 2:
                Map<Facility, Integer> houseMap = display(option);
                for (Facility key : houseMap.keySet()) {
                    if (key.getServiceId().equals(id)) {
                        houseMap.remove(houseMap.get(id));
                        break;
                    }
                }
            case 3:
                Map<Facility, Integer> roomMap = display(option);
                for (Facility key : roomMap.keySet()) {
                    if (key.getServiceId().equals(id)) {
                        roomMap.remove(roomMap.get(id));
                        break;
                    }
                }
        }
    }


    @Override
    public int searchIndex(String id) {
        int option = 0;
        switch (option) {
            case 1:
                Map<Facility, Integer> villaMap = display(option);
                for (Facility key : villaMap.keySet()) {
                    if (!key.getServiceId().equals(id)) {
                        return -1;
                    }
                }
            case 2:
                Map<Facility, Integer> houseMap = display(option);
                for (Facility key : houseMap.keySet()) {
                    if (!key.getServiceId().equals(id)) {
                        return -1;
                    }
                }
            case 3:
                Map<Facility, Integer> roomMap = display(option);
                for (Facility key : roomMap.keySet()) {
                    if (!key.getServiceId().equals(id)) {
                        return -1;
                    }
                }
        }
        return 0;
    }
}
