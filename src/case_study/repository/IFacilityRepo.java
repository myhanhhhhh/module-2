package case_study.repository;

import case_study.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepo {
    Map<Facility,Integer> display(int option);
    void addFacility(int option, Facility facility);
    String searchIndex(int option, String id);
    void displayMaintance();
}
