package functionAndArrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int num =0;
        int i =0;
        while(n>0){
            num += (n%10)*(int)Math.pow(b,i);
            i++;
            n/=10;
        }
        return num;
    }
}
