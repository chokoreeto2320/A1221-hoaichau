package ss3_array.baitap;

import java.util.Scanner;

public class giatrinhonhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            System.out.println("arr["+i+"] =");
            arr[i] = scanner.nextInt();
        }
        System.out.println("mang vua nhap:");
        for (int i = 0;i<arr.length;i++){
            System.out.println("arr["+i+"] = " + arr[i]);
        }
        int min = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la:" + min);

    }
}
