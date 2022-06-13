package beg.functionAndArrays;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        int borrow =0;
        int ans =0;
        int pow =1;
        while(n2>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1/=10;
            n2/=10;
            int d =0;
            d2-=borrow;
            if(d2>=d1){

                d= d2-d1;
                borrow =0;
            }
            else{
                d= (d2+b)-d1;
                borrow=1;
            }
            ans += d* pow;

            pow *=10;
        }
        return ans;
    }
}
