//package ss4_oop.baitap;
//
//import java.util.Scanner;
//
//public class phuongtrinhbachai {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("phuong trinh bac hai:");
//        System.out.println("nhap a:");
//        int a = scanner.nextInt();
//        System.out.println("nhap b:");
//        int b = scanner.nextInt();
//        System.out.println("nhap c:");
//        int c = scanner.nextInt();
//        Classptbh ptbh = new Classptbh(a, b, c);
//        System.out.println("phuong trinh " + ptbh.display());
//        if (a == 0) {
//            if (b == 0) {
//                if (c == 0) {
//                    System.out.println("phuong trinh cos 1 nghiem");
//
//                } else {
//                    System.out.println("phuong trinh cos vo so nghiem");
//                }
//            } else {
//                System.out.println("phuong trinh cos nghiem x =" + (-c / a));
//            }
//        } else {
//            double delta = ptbh.getDiscriminant();
//            if (delta == 0) {
//                System.out.println("phuong trinh cos nghiem kep x = " + (-b / (2 * a)));
//
//            } else if (delta < 0) {
//                System.out.println("phuong trinh vo nghiem");
//            } else {
//                System.out.println("phuong trinh cos 2 nghiem x1 = %d, x2 = %d", ptbh.getRoot1(), ptbh.getRoot2());
//            }
//        }
//
//    }
