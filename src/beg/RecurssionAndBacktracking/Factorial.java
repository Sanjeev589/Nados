package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        return n==1?1:(n*factorial(n-1));
    }
}
