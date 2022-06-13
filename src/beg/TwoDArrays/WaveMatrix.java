package beg.TwoDArrays;

import java.util.Scanner;

//state of wakanda
public class WaveMatrix {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                arr1[i][j] = sc.nextInt();
        for(int j=0;j<c1;j++){
            if(j%2==0){
                for(int i=0;i<r1;i++)
                    System.out.println(arr1[i][j]+" ");
            }
            else if(j%2!=0)
            {
                for(int i=r1-1;i>=0;i--)
                    System.out.println(arr1[i][j]+" ");
            }
        }
    }
}
