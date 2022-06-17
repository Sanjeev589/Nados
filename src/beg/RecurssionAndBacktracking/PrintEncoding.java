package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }else if(str.length()==1){
            int ch = str.charAt(0)-'0';
            if(ch==0)
                return;
            System.out.println(asf+ch);
        }else{
            int ch = str.charAt(0)-'0';
            String rem1 = str.substring(1);
            if(ch==0)
                return;
            else{
                char c = (char)('a'+ch-1);
                printEncodings(rem1,asf+c);
            }

            String ini = str.substring(0,2);
            String rem = str.substring(2);
            int val = Integer.parseInt(ini);
            if(val<=26){
                char c = (char)('a'+ch-1);
                printEncodings(rem,asf+c);
            }
        }
    }
}
