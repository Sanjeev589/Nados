package beg.String;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
    public static void solution(ArrayList<Integer> al){
        // write your code here
        for(int i=0;i<al.size();i++){
            if(isPrime(al.get(i))){
                al.remove(i);
                i--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

    public static boolean isPrime(Integer i){
        for(int j=2;j*j<=i;j++){
            if(i%j==0)
                return false;
        }
        return true;
    }
}
