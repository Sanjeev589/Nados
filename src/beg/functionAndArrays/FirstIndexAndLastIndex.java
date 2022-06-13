package beg.functionAndArrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int val = sc.nextInt();

        int low =0;
        int high=arr.length-1;
        int fIndex =-1;
        while(low<=high){
            int mid = high+low/2;
            if(arr[mid]==val){
                fIndex=mid;
                low= mid+1;
            }
            else if(arr[mid]>val)
                high=mid-1;
            else
                low=mid+1;
        }
        low =0;
        high=arr.length-1;
        int lIndex =-1;
        while(low<=high){
            int mid = high+low/2;
            if(arr[mid]==val){
                lIndex=mid;
                high=mid-1;
            }
            else if(arr[mid]>val)
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println(lIndex+"\n"+fIndex);

    }

}
