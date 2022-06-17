package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ini = str.charAt(i);
            String part1 = str.substring(0,i);
            String part2 = str.substring(i+1);
            printPermutations(part1+part2, asf+ini);
        }
    }

}
