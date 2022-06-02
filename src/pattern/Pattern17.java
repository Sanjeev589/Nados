package pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star =1;
        for(int i=0;i<n;i++){
            if(i==n/2)
                for(int j=0;j<n/2;j++)
                    System.out.print("*\t");
            else
                for(int j=0;j<n/2;j++)
                    System.out.print("\t");
            for(int j=0;j<star;j++)
                System.out.print("*\t");
            if(i<n/2)
                star++;
            else
                star--;
            System.out.println();
        }
    }
}
