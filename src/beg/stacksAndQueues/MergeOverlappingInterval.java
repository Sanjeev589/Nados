package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            Pair p = new Pair(arr[i][0],arr[i][1]);
            pairs[i] = p;
        }
        Arrays.sort(pairs);
        Stack<Pair> stack = new Stack();
        for(int i=0;i<pairs.length;i++){
            if(i==0)
                stack.push(pairs[i]);
            else{
                Pair top = stack.peek();
                if(pairs[i].st>top.ed)
                    stack.push(pairs[i]);
                else{
                    top.ed = Math.max(pairs[i].ed,top.ed);

                }
            }
        }
        Stack<Pair> st = new Stack();
        while(stack.size()>0)
            st.push(stack.pop());
        while(st.size()>0){
            System.out.println(st.peek().st+" "+st.peek().ed);
            st.pop();
        }
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int ed;
        Pair(int st, int ed){
            this.st = st;
            this.ed = ed;
        }

        public int compareTo(Pair other){
            if(this.st>other.st)
                return this.st-other.st;
            else if(this.st==other.st)
                return 0;
            else
                return this.st-other.st;
        }

    }

}
