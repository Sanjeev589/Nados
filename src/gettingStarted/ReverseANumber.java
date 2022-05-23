package gettingStarted;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            int revDigit = num%10;
            System.out.println(revDigit);
            num/=10;

        }
    }
}
