package beg.RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getKPC(str));
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("");
            return arr;
        }
        char initailChar = str.charAt(0);
        String remainingStr = str.substring(1);
        ArrayList<String> subStrs = getKPC(remainingStr);
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=0;i<codes[initailChar-'0'].length();i++){
            for(String s: subStrs){
                ans.add(codes[initailChar-'0'].charAt(i)+s);
            }
        }
        return ans;
    }
}
