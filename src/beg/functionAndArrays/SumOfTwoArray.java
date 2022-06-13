package beg.functionAndArrays;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = sc.nextInt();
        int[] sum = new int[size1>size2? size1:size2];
        int i = arr1.length-1,j=arr2.length-1 ;
        int carry=0, k= sum.length-1;
        while(k>=0){
            int d= carry;
            if(i>=0)
                d+=arr1[i];
            if(j>=0)
                d+=arr2[j];
            carry=d/10;
            d=d%10;
            i--;
            j--;
            sum[k]=d;
            k--;
        }
        if(carry!=0)
            System.out.println(carry);
        for(int x=0;x<sum.length;x++)
            System.out.println(sum[x]);

    }
}
