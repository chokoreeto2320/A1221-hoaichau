package ss1_introductionjava.baitap;

import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
            System.out.println("ung dung chuyen doi tien te");
            System.out.print("nhap ti gia usd va vnd: ");
            Scanner scanner=new Scanner(System.in);
            float rate=scanner.nextFloat();
            System.out.print("nhap usd: ");
            float usd=scanner.nextFloat();
            float vnd=usd*rate;
            System.out.printf("%.2f USD into %.2f VND",usd,vnd);
    }
}

