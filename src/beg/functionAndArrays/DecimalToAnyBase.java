package beg.functionAndArrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int num=0;
        int i=0;
        while(n>0){
            num = num + (int)Math.pow(10,i)*(n%b);  //for num + rem.pow(10,i)
            n/=b;
            i++;
        }
        return num;
    }
}
