package beg.timeAndSpaceComplexity;

import java.util.Scanner;
///logn solution
public class PivotInSortedRotatedArray {

    public static int findPivot(int[] arr) {
        // write your code here
        int lo =0;
        int hi = arr.length -1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[hi])
                lo = mid+1;
            else
                hi = mid;
        }
        return arr[lo];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = findPivot(arr);
        System.out.println(pivot);
    }

}
