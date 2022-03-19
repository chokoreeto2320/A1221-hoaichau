package ss1_introductionjava.thuchanh;

import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width:");
        width = scanner.nextFloat();

        System.out.println("enter height:");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("area is: " + area);

    }
}
