package ss1_introductionjava.thuchanh;

import java.util.Scanner;
public class giaiphuongtrinhbatnhat {
    public static void main(String[] args) {
        System.out.println("linear equation resolver");
        System.out.println("Given a equation as 'a*x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a = scanner.nextDouble();

        System.out.println("b:");
        double b = scanner.nextDouble();

        System.out.println("c:");
        double c = scanner.nextDouble();

        if ( a !=0) {
            double answer = ( c - b) / a;
            System.out.printf("equation pass with x = %f!\n", answer);
        }else {
            if ( b == c) {
                System.out.println("the solution is all x!");
            } else {
                System.out.println("no solution");
            }
        }

    }
}
