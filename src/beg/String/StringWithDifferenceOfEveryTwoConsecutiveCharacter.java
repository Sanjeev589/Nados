package beg.String;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacter {
    public static String solution(String str){
        // write your code here
        String s =""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            s+=(str.charAt(i)-str.charAt(i-1));
            s+=str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
