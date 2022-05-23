package gettingStarted;

import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
