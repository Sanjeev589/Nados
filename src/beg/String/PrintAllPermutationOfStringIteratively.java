package beg.String;

import java.util.Scanner;

public class PrintAllPermutationOfStringIteratively {
    public static void solution(String str){
        // write your code here
        int totalPerm = factorial(str.length());
        int size = str.length();
        for(int i=0;i<totalPerm;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div =size;div>=1;div--){
                int rem = temp%div;
                int quo = temp/div;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp=quo;
            }
            System.out.println();
        }

    }
    public static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
