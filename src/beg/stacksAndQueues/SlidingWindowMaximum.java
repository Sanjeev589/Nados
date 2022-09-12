package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        int[] ng = new int[arr.length];
        ng[arr.length-1] = arr.length;
        Stack<Integer> stack = new Stack();
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(stack.size()>0 && arr[i]>arr[stack.peek()])
                stack.pop();
            if(stack.size()==0)
                ng[i] = arr.length;
            else
                ng[i] = stack.peek();
            stack.push(i);
        }
        int j=0;
        for(int i=0;i<=arr.length-k;i++,j=i){
            while(ng[j]<i+k)
                j=ng[j];
            System.out.println(arr[j]);
        }
        // code
    }
}
