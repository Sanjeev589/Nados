package beg.String;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        String s =""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1))
                s+=str.charAt(i);
        }

        return s;
    }

    public static String compression2(String str){
        String s =""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1))
                count++;
            else{

                if(count>1)
                    s+=count;
                s+=str.charAt(i);
                count=1;
            }


        }
        if(count>1)
            s+=count;

        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}
