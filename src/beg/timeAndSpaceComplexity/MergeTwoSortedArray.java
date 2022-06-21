package beg.timeAndSpaceComplexity;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here
        int[] arr = new int[a.length+b.length];
        int i=0, j=0;
        for(int k=0;k<arr.length;k++){
            if(i<a.length && j<b.length )
            {
                if(a[i]<b[j]){
                    arr[k] = a[i];
                    i++;
                }
                else{
                    arr[k] = b[j];
                    j++;
                }
            }
            else if(i<a.length){
                arr[k] = a[i];
                i++;
            }
            else if(j<b.length){
                arr[k] = b[j];
                j++;
            }
        }
        return arr;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }
}
