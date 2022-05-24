package gettingStarted;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int divisor = n1;
        int dividend = n2;
        while(dividend % divisor !=0){
            int remender = dividend % divisor;
            dividend = divisor;
            divisor = remender;
        }
        System.out.println(divisor);    //GCD
        System.out.println((n1*n2)/divisor);        //LCM
    }
}
