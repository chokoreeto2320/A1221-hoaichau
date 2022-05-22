package case_study.Furuma_resort.models;

public abstract class Facility {
    private String idFacility;
    private String nameService;
    private double areaUse;
    private int rentalPrice;
    private int rentaPeopleMax;
    private String styleRental;

     public Facility() {

     }

    public Facility(String idFacility, String nameService, double areaUse, int rentalPrice, int rentaPeopleMax, String styleRental) {
        this.idFacility = idFacility;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.rentaPeopleMax = rentaPeopleMax;
        this.styleRental = styleRental;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentaPeopleMax() {
        return rentaPeopleMax;
    }

    public void setRentaPeopleMax(int rentaPeopleMax) {
        this.rentaPeopleMax = rentaPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", rentalPrice=" + rentalPrice +
                ", rentaPeopleMax=" + rentaPeopleMax +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
