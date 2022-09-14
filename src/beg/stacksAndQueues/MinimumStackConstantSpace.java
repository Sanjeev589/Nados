package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumStackConstantSpace {

    public static class MinStack {
        Stack<Integer> data;
        int min;

        public MinStack() {
            data = new Stack<>();
        }

        int size() {
            return data.size();
            // write your code here
        }

        void push(int val) {
            if(data.size()==0){
                min=val;
                data.push(val);
            }
            else if(val>=min){
                data.push(val);
            }
            else{
                data.push(val+val-min);
                min= val;}

            // write your code here
        }

        int pop() {
            if(size()==0)
            {
                return -1;
            }
            else{
                if(data.peek()>=min)
                {
                    return data.pop();
                }
                else{

                    int val = min;
                    min=  2*min - data.pop();
                    return val;
                }

            }
            // write your code here
        }

        int top() {
            if(size()==0)
                return -1;
            else {
                if(data.peek()>=min)
                    return data.peek();
                else
                    return min;
            }
            // write your code here
        }

        int min() {
            if(size()==0)
                return -1;
            return min;
            // write your code here
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.min();
                if (val != -1) {
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}
