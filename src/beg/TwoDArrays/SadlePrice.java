package beg.TwoDArrays;

import java.util.Scanner;

public class SadlePrice {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();

        for(int i=0;i<n;i++){
            int sj = 0;
            for(int j=0;j<n;j++){
                if(arr[i][sj]>arr[i][j])
                    sj=j;
            }
            boolean flag =true;
            for(int k=0;k<n;k++){
                if(arr[i][sj]<arr[k][sj])
                {
                    flag =false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i][sj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
