package TwoDArrays;

import java.util.Scanner;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j] = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }
}
