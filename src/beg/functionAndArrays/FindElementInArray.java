package beg.functionAndArrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        int num = sc.nextInt();
        int index =-1;
        for(int i=0;i<size;i++)
            if(num==arr[i])
                index =i;
        System.out.println(index);
    }
}
