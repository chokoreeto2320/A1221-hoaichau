package ss3_array.baitap;

import java.util.Scanner;
public class xoaphantukhoimang {
    public static void deleteArray (int[] arr,int x)
    {
        int del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                del = i;
                i--;

            }
            if (del != -1) {
                for (int j = del; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                    del = -1;
                }
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa :");
        int x = sc.nextInt();
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length-3];

        deleteArray(arr1,x);


        for (int i = 0 ; i < arr2.length;i++)
        {
            arr2[i]=arr1[i];
        }


        for (int i = 0; i< arr2.length;i++)
        {
            System.out.print(arr2[i]);
        }


    }
}
