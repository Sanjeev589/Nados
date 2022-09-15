package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapter_PushEff {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
            // write your code here
        }

        void push(int val) {
            mainQ.add(val);
            // write your code here
        }

        int pop() {

            int top=0;
            while(mainQ.size()>0)
            {
                if(mainQ.size()==1)
                    top=mainQ.remove();
                else
                    helperQ.add(mainQ.remove());
            }
            while(helperQ.size()>0)
                mainQ.add(helperQ.remove());
            return top;
            // write your code here
        }

        int top() {
            int top=0;
            while(mainQ.size()>0)
            {
                if(mainQ.size()==1)
                    top=mainQ.peek();
                helperQ.add(mainQ.remove());
            }
            while(helperQ.size()>0)
                mainQ.add(helperQ.remove());
            return top;
            // write your code here
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        QueueToStackAdapter st = new QueueToStackAdapter();

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
            }
            str = br.readLine();
        }
    }
}
