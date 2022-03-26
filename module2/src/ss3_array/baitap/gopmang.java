package ss3_array.baitap;

public class gopmang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[arr1.length+arr2.length];
        int count = 0 ;
        for (int i = 0 ; i<arr1.length;i++)
        {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i<arr2.length;i++)
        {
            arr3[count]=arr2[i];
            count++;
        }
        for (int i = 0 ; i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
