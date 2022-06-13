package beg.gettingStarted;

import java.util.Scanner;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int num = low;
        while(num<=high){
            int count =0;
            for(int i=2; i*i<=num; i++){
                if(num%i==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(num);
            num++;
        }
    }
}
