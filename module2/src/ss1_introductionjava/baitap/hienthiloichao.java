package ss1_introductionjava.baitap;

import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        System.out.println("nhap ten ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.print("Hello "+name);
    }
}
