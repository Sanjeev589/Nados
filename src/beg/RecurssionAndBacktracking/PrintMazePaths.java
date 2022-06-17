package beg.RecurssionAndBacktracking;

import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        printMazePaths(0,0,row-1,col-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc ==dc){
            System.out.println(psf);
            return;
        }
        else if(sr>dr || sc>dc)
            return;
        printMazePaths(sr,sc+1,dr,dc,psf+"h");
        printMazePaths(sr+1,sc,dr,dc,psf+"v");

    }
}
