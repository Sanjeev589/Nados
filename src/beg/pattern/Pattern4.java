package beg.pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i-1;j++)
                System.out.print("\t");
            for(int k=i;k<=n;k++)
                System.out.print("*\t");
            System.out.println();
        }

    }
}
