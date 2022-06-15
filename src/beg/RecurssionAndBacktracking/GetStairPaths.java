package beg.RecurssionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(getStairPaths(n));
}

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("");
            return arr;
        }else if(n<0){
            ArrayList<String> arr = new ArrayList<String>();
            return arr;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> ans = new ArrayList<String>();
        for(String path:paths1)
            ans.add(1+path);
        for(String path:paths2)
            ans.add(2+path);
        for(String path:paths3)
            ans.add(3+path);

        return ans;

    }

}
