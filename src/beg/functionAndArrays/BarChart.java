package beg.functionAndArrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max=-1;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max)
                max=arr[i];
        }

        for(int i=max;i>0;i--){
            for(int j=0;j<size;j++){
                if(arr[j]>=i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");

            }

            System.out.println();
        }
    }
}
