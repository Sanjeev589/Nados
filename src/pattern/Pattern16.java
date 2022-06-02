package pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val =1;
        int space = 2*n -3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=val;j++)
                System.out.print(j+"\t");
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            if(i==n)
                val--;
            for(int j=val;j>=1;j--)
                System.out.print(j+"\t");
            System.out.println();
            space -=2;
            val++;
        }
    }
}
