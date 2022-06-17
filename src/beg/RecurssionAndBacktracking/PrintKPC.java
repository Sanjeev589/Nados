package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str,"");
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ini = str.charAt(0);
        String rem = str.substring(1);
        String keypadValue = codes[ini-'0'];
        for(int i=0;i<keypadValue.length();i++){
            char ch = keypadValue.charAt(i);
            printKPC(rem,asf+ch);
        }
    }
}
