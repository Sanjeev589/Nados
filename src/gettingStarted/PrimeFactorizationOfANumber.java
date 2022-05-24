package gettingStarted;

import java.util.Scanner;

public class PrimeFactorizationOfANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int div =2; div*div<=num;div++){
            while(num%div==0){
                System.out.print(div+" ");
                num/=div;
            }
        }
        if(num!=1)
            System.out.println(num);
    }
}
