package beg.gettingStarted;

import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0)
            System.out.println(0);
        if(n>=1)
            System.out.println(1);
        int a=0;
        int b=1;
        n-=2;
        while(n>=0){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
        }
    }
}
