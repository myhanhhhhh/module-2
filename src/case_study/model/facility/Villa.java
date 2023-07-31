package case_study.model.facility;

public class Villa extends Facility {
    private String kindOfRoom;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String kindOfRoom, double poolArea, int numberOfFloor) {
        super(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.kindOfRoom = kindOfRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                " serviceCode='" + getServiceId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() +
                ", rentalCost=" + getServiceId() +
                ", maxPeople=" + getMaxPeople() +
                ", rentalType=" + getRentalType() +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}