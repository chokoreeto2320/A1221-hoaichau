package ss3_array.baitap;

import java.util.Scanner;

public class themphantuvaomang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can them:");
        int number = scanner.nextInt();
        System.out.println("Nhap vi tri can them");
        int index = scanner.nextInt();
        int [] arr = {0,1,2,3,4,5,0,0,0,0};
        them(arr,number,index);
    }

    public static void them(int [] arr, int number,int index) {
        if (index >= 1 || index <= arr.length-1){
            for (int i = arr.length-1; i>= index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = number;
        }else
            System.out.println("khong the them phan tu vao mang");
        for(int i = 0; i<arr.length;i++){
            System.out.println("arr["+i+"] = " + arr[i]);
        }



    }
}
