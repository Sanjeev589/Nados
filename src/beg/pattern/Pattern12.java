package beg.pattern;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0, y=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x+"\t");
                    int z = x + y;
                    x = y;
                    y = z;

            }
            System.out.println();
        }
    }
}
