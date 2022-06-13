package beg.gettingStarted;

import java.util.Scanner;

public class InverseOfANumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos =1;
        int inv =0;
        while(num>0){
            int dig = num%10;

            inv = inv+(int)Math.pow(10,dig-1)*pos;
            pos++;
            num/=10;
        }
        System.out.println(inv);
    }
}
