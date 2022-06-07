package TwoDArrays;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                arr1[i][j] = sc.nextInt();
        int totalElements = r1*c1;
        int count=0;
        int top=0;
        int bottom=r1-1;
        int left =0;
        int right= c1-1;
        while(count<totalElements){
            for(int i=top; i<=bottom && count<totalElements;i++,count++)
                System.out.println(arr1[i][left]);
            left++;
            for(int i=left; i<=right && count<totalElements;i++,count++)
                System.out.println(arr1[bottom][i]);
            bottom--;
            for(int i=bottom; i>=top && count<totalElements;i--,count++)
                System.out.println(arr1[i][right]);
            right--;
            for(int i=right; i>=left && count<totalElements;i--,count++)
                System.out.println(arr1[top][i]);
            top++;
        }
    }
}
