package TwoDArrays;

import java.util.Scanner;

//state of wakanda -2
public class UpperDaigonal {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();

        int curCol =0;
        while(curCol<n){
            for(int i=0, j= curCol ;i<n && j<n;i++,j++)
                System.out.println(arr[i][j]);
            curCol++;
        }
    }
}
