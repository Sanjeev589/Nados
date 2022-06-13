package beg.gettingStarted;

import java.util.Scanner;

public class PythagoreanTriplets {

    public static void main(String[] args) {
        //   Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b>max)
            max =b;
        if(c>max)
            max = c;

        boolean flag=false;
        if(max==a)
            flag = (((b*b)+(c*c))==a*a);
        else if(max==b)
            flag = (((a*a)+(c*c))==b*b);
        else if(max==c)
            flag = (((b*b)+(a*a))==c*c);
        System.out.println(flag);
    }
}
