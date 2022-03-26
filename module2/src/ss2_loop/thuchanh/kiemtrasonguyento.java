package ss2_loop.thuchanh;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so:");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number +"khong phai la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number +" la so nguyen to");
            else
                System.out.println(number + " khong phai la so nguyen to");
        }

    }
}
