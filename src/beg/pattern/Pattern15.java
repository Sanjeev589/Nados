package beg.pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int val = 1;
        for(int i=0;i<n;i++){
            int x = val;
            for(int j =0;j<sp;j++)
                System.out.print("\t");
            for(int j = 0; j<st;j++){
                System.out.print(x+"\t");
                if(j<st/2)
                    x++;
                else
                    x--;
            }
            if(i<n/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}