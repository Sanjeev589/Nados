package beg.linkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListToQueueAdapter {


    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
            // write your code here
        }

        void add(int val) {
            list.addLast(val);
            // write your code here
        }

        int remove() {
            if(list.size()==0){
                System.out.println("Queue Underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
            // write your code here
        }

        int peek() {

            if(list.size()==0){
                System.out.println("Queue Underflow");
                return -1;
            }else{
                return list.getFirst();
            }
            // write your code here
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToQueueAdapter qu = new LLToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}
