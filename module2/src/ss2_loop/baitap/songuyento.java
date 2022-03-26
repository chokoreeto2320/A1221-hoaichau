package ss2_loop.baitap;
import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap number :");
        int number = sc.nextInt();
        int N = 2;
        int count = 0 ;
        while (count<number){
            boolean isPrime = true ;

            for(int i=2;i<N;i++)
            {
                if(N%i==0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.print(" " + N );
                count++;
            }
            N++;
        }
    }
}