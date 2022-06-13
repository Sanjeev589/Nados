package beg.pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n/2;
        int star = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++)
                System.out.print("\t");
            for(int k=0;k<star;k++)
                System.out.print("*\t");
            System.out.println();
            if(i<=n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
        }

    }
}
