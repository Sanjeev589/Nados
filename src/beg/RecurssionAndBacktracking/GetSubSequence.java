package beg.RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> abs = new ArrayList<String>();
            abs.add("");
            return abs;
        }
        char intitalChar = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> rem = gss(subStr);
        ArrayList<String> ans = new ArrayList();
        for(String s: rem){
            ans.add(""+s);
        }
        for(String s: rem){
            ans.add(intitalChar+s);
        }
        return ans;
    }
}
