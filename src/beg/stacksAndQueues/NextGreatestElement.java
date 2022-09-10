package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreatestElement {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        int[] ans = new int[arr.length];
        Stack<Integer> stck = new Stack();
        ans[arr.length-1] = -1;
        stck.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while(stck.size()>0 && stck.peek()<arr[i])
                stck.pop();
            if(stck.size()==0)
                ans[i]=-1;
            else
                ans[i]=stck.peek();
            stck.push(arr[i]);
        }
        return ans;
    }

}
