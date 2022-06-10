package String;

import java.util.Scanner;

public class AllPanlindromicSubString {
    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String subString = str.substring(i,j);
                if(isPalindrome(subString))
                    System.out.println(subString);
            }
        }

    }

    private static boolean isPalindrome(String subString) {
        int i =0;
        int j = subString.length()-1;
        while(i<=j){
            char left = subString.charAt(i);
            char right = subString.charAt(j);
            if(left==right){
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}
