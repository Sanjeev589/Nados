package beg.gettingStarted;

import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();
        int[] n = new int[t];
        for(int i=0;i<t;i++)
            n[i] = scn.nextInt();
        int count =0;
        int len = 0;
        while(len<n.length){
            for(int i=2; i*i<=n[len]; i++){
                if(n[len]%i==0){
                    count++;
                    System.out.println("not prime");
                    break;
                }
            }
            if(count==0)
                System.out.println("prime");
            count=0;
            len++;
        }
    }
}
