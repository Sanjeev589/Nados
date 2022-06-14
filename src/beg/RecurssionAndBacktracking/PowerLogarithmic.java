package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)
            return 1;
        int xp2 = power(x,n/2);
        int ans = xp2*xp2;
        if(n%2==1)
            ans*=x;
        return ans;
    }
}
