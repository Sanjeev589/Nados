package pattern;

import java.util.Scanner;
// since the first half is symentrical to the second half , using combination formulas
public class Pattern13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int iCj =1;
            for(int j=0;j<=i;j++){
                System.out.print(iCj+"\t");
                int iCjp1 = iCj * (i-j) /(j+1);
                iCj = iCjp1 ;
            }
            System.out.println();
        }
    }
}
