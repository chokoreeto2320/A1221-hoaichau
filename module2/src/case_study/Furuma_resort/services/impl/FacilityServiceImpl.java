package case_study.Furuma_resort.services.impl;

import case_study.Furuma_resort.models.House;
import case_study.Furuma_resort.models.Villa;
import case_study.Furuma_resort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<House, Integer> facilityIntegerMap = new LinkedHashMap<House, Integer>();
    private static Scanner scanner = new Scanner(System.in);
    private Villa villa;
    private House house;

    @Override
    public void display() {
        for (Map.Entry<House, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " so lan da thue : " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("nhap id");
        String idFacility = (scanner.nextLine());
        System.out.println("nhap ten");
        String nameService = scanner.nextLine();
        System.out.println("nhap dien tich");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia tien");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so luong nguoi");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String styleRental = (scanner.nextLine());
        System.out.println("nhap tieu chuan");
        String standardVilla = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        Integer put = facilityIntegerMap.put(house, 0);
        System.out.println("da them moi villa thanh cong");
    }

    @Override
    public void addNewHouse() {
        System.out.println("nhap id");
        String idFacility = (scanner.nextLine());
        System.out.println("nhap ten");
        String nameService = scanner.nextLine();
        System.out.println("nhap dien tich");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia tien");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so luong nguoi");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String styleRental = (scanner.nextLine());
        System.out.println("nhap tieu chuan");
        String standardVilla = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        var house = new House(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("da them house thanh cong");
    }

    @Override
    public void addNewRoom() {

    }
}

