package ss1_introductionjava.thuchanh;
import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which mon that you want to count day?");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("the month '2' has 28 or 29 day!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month '"+month +"'has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month '"+ month +"'has 30 days");
                break;
            default:
                System.out.println("invalid input!");
                break;
        }

    }
}
