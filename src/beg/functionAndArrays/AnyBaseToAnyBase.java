package beg.functionAndArrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int ansDecimal = convertToDecimal(n,sourceBase );
        int ans = convetDecimalToAny(ansDecimal, destBase);
        System.out.println(ans);
    }

    public static int convertToDecimal(int num, int sourceBase){
        int ans =0;
        int i=0;
        while(num>0){
            ans += (int)Math.pow(sourceBase,i)*(num%10);
            num/=10;
            i++;
        }
        return ans;
    }
    public static int convetDecimalToAny(int num, int destBase){
        int ans =0;
        int i=0;
        while(num>0){
            ans +=  (int)Math.pow(10,i)*(num%destBase);
            num/=destBase;
            i++;
        }
        return ans;
    }
}
