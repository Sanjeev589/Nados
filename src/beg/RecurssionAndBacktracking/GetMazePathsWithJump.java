package beg.RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println(getMazePaths(0,0,row-1,col-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("");
            return arr;
        }
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=1; i<= dr-sr;i++){
            ArrayList<String> hpaths = getMazePaths(sr+i,sc,dr,dc);
            for(String s:hpaths)
                ans.add("h"+i+s);
        }
        for(int i=1; i<= dc-sc;i++){
            ArrayList<String> vpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String s: vpaths)
                ans.add("v"+i+s);
        }
        for(int i=1; i<= dc-sc && i<=dr-sr;i++){
            ArrayList<String> dpaths = getMazePaths(sr+i,sc+i,dr,dc);
            for(String s: dpaths)
                ans.add("d"+i+s);
        }
        return ans;
    }



}
