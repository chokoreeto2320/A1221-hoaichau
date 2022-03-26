package ss2_loop.baitap;
import java.util.Scanner;

public class songuyentonho100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 2;
        while (number<100){
            boolean isPrime = true ;
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isPrime = false;
                }
            }
            if (isPrime)
            {
                System.out.print(" " + number );

            }
            number++;
        }
    }
}


