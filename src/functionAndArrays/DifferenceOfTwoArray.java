package functionAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0;i<size1;i++)
            arr1[i] = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0;i<size2;i++)
            arr2[i] = sc.nextInt();
        int[] diff = new int[size1>size2? size1:size2];
        int i = arr1.length-1,j=arr2.length-1 ;
        int borrow=0, k= diff.length-1;
        while(k>=0){
            int d =0;
            int arr1value = i>=0?arr1[i]:0;
            if(arr2[j]-borrow>=arr1value){
                d=arr2[j]-borrow-arr1value;
                borrow =0;
            }
            else{
                d=arr2[j]-borrow+10-arr1value;
                borrow =1;
            }

            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int index =0;
        while(index<diff.length){
            if(diff[index]==0)
                index++;
            else
                break;
        }
        for(;index<diff.length;index++)
            System.out.println(diff[index]);

    }

}
