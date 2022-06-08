package TwoDArrays;

import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j] = sc.nextInt();
        int shell = sc.nextInt();
        int rotate = sc.nextInt();
        rotateShell(arr,shell,rotate);
        display(arr);
    }

    public static void rotateShell(int[][] arr, int shell, int rotate){
        int[] oneDarray = createOneDFromShell(arr,shell);
        rotateOneD(oneDarray,rotate);
        fillShellFromOneD(arr, oneDarray,shell);
    }

    private static void fillShellFromOneD(int[][] arr, int[] oneDarray,int shell) {
        int minr = shell-1;
        int minc = shell-1;
        int maxr = arr.length -shell;
        int maxc = arr[0].length - shell ;
        int idx =0;
        for(int i =minr, j= minc; i<=maxr;i++,idx++)
            arr[i][j] = oneDarray[idx] ;
        for(int i =maxr, j= ++minc; j<=maxc;j++,idx++)
            arr[i][j] = oneDarray[idx] ;
        for(int i =--maxr, j= maxc; i>=minr;i--,idx++)
            arr[i][j] = oneDarray[idx] ;
        for(int i =minr, j= --maxc; j>=minc;j--,idx++)
            arr[i][j] = oneDarray[idx] ;
    }

    private static void rotateOneD(int[] oneDarray, int rotate) {
        rotate %= oneDarray.length;
        if(rotate<0)
            rotate+= oneDarray.length;
        reverseArray(oneDarray,0,oneDarray.length-rotate-1);
        reverseArray(oneDarray,oneDarray.length-rotate, oneDarray.length-1);
        reverseArray(oneDarray,0,oneDarray.length-1);
    }

    private static void reverseArray(int[] oneDarray, int left, int right) {
        while(left<right){
            int temp = oneDarray[left];
            oneDarray[left] = oneDarray[right];
            oneDarray[right] = temp;
            left++;
            right--;
        }
    }

    private static int[] createOneDFromShell(int[][] arr, int shell) {
        int minr = shell-1;
        int minc = shell-1;
        int maxr = arr.length -shell;
        int maxc = arr[0].length - shell ;
        int size = 2*(maxr-minr+maxc-minc);
        int[] oneDarray = new int[size];
        int idx =0;
        for(int i =minr, j= minc; i<=maxr;i++,idx++)
            oneDarray[idx] = arr[i][j];
        for(int i =maxr, j= ++minc; j<=maxc;j++,idx++)
            oneDarray[idx] = arr[i][j];
        for(int i = --maxr, j= maxc; i>=minr;i--,idx++)
            oneDarray[idx] = arr[i][j];
        for(int i =minr, j= --maxc; j>=minc;j--,idx++)
            oneDarray[idx] = arr[i][j];


        return oneDarray;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
