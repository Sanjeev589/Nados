package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumSTack_I {

    public static class MinStack {
        Stack<Integer> allData;
        Stack<Integer> minData;
        int topMin;
        int topData;
        public MinStack() {
            allData = new Stack<>();
            minData = new Stack<>();
            topMin = -1;
            topData = -1;
        }


        int size() {
            return allData.size();
            // write your code here
        }

        void push(int val) {
            allData.push(val);
            if(minData.size()==0)
                minData.push(val);
            if(minData.size()>0 && val<minData.peek())
                minData.push(val);
            // write your code here
        }

        int pop() {
            int x = allData.pop();
            if(x==minData.peek())
                minData.pop();
            return x;
            // write your code here
        }

        int top() {
            return allData.peek();
            // write your code here
        }

        int min(){
            return minData.peek();
            // write your code here
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            } else if(str.startsWith("min")){
                int val = st.min();
                if(val != -1){
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}
