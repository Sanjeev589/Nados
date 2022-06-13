package beg.gettingStarted;

import java.util.Scanner;

public class RotateANumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int totalDigits =0;
        int temp = num;
        while(temp>0){
            temp/=10;
            totalDigits++;
        }
        k%=totalDigits;  //for k>totalDigits
        if(k<0)
            k+=totalDigits; //for -ve value of k
        int quotient = num/(int)Math.pow(10,k);
        int remainder = num%(int)Math.pow(10,k);

        int reversedNum = remainder*(int)Math.pow(10,totalDigits-k)+quotient ;
        System.out.println(reversedNum);

    }
}
