package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoStackInArray {

    public static class TwoStack {
        int[] data;
        int tos1;
        int tos2;

        public TwoStack(int cap) {
            data = new int[cap];
            tos1=0;
            tos2=cap-1;
            // write your code here
        }

        int size1() {
            return tos1;
            // write your code here
        }

        int size2() {
            return data.length-tos2-1;
            // write your code here
        }

        void push1(int val) {
            if(size1()+size2()==data.length)
            {
                System.out.println("Stack overflow");

            }
            else{
                data[tos1++] = val;
            }
            // write your code here
        }

        void push2(int val) {
            if(size1()+size2()==data.length)
            {
                System.out.println("Stack overflow");

            }
            else{
                data[tos2--] = val;
            }
            // write your code here
        }

        int pop1() {
            if(size1()==0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
                return data[--tos1];
            // write your code here
        }

        int pop2() {
            if(size2()==0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
                return data[++tos2];
            // write your code here
        }

        int top1() {
            if(size1()==0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
                return data[tos1-1];
            // write your code here
        }

        int top2() {
            if(size2()==0)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            else
                return data[tos2+1];
            // write your code here
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TwoStack st = new TwoStack(n);

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push1")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push1(val);
            } else if (str.startsWith("pop1")) {
                int val = st.pop1();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top1")) {
                int val = st.top1();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size1")) {
                System.out.println(st.size1());
            } else if (str.startsWith("push2")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push2(val);
            } else if (str.startsWith("pop2")) {
                int val = st.pop2();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top2")) {
                int val = st.top2();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size2")) {
                System.out.println(st.size2());
            }
            str = br.readLine();
        }
    }
}
