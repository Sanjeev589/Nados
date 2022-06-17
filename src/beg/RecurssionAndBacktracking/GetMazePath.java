package beg.RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
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
        if(sr==dr && sc==dc){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("");
            return arr;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc<=dc)
            hpaths = getMazePaths(sr,sc+1,dr,dc);
        if(sr<=dr)
            vpaths = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> ans = new ArrayList<String>();
        hpaths.forEach(s->{ans.add("h"+s);});
        vpaths.forEach(s->{ans.add("v"+s);});
        return ans;
    }

}
