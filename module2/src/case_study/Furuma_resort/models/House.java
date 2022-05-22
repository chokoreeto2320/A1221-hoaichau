package case_study.Furuma_resort.models;

import case_study.Furuma_resort.views.Facility;

public class House extends Facility {
    private String standardHouse;
    private double areaPool;
    private int floor;

    public House(){
    }

    public House(String standardHouse, double areaPool, int floor) {
        this.standardHouse = standardHouse;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
        super();
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardHouse='" + standardHouse + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
