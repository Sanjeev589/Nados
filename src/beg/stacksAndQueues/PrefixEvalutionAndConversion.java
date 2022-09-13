package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvalutionAndConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> val = new Stack();
        Stack<String> infix = new Stack();
        Stack<String> postfix = new Stack();

        for(int i=exp.length()-1;i>=0;i--){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v1 = val.pop();
                int v2 = val.pop();
                val.push(evaluate(v1, v2, ch));
                String s1 = infix.pop();
                String s2 = infix.pop();
                infix.push("("+s1+ch+s2+")");
                s1 = postfix.pop();
                s2 = postfix.pop();
                postfix.push(s1+s2+ch+"");
            }
        }
        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
        // code
    }
    public static int evaluate(int v1, int v2, char op){
        if(op=='+')
            return v1+v2;
        else if(op=='-')
            return v1-v2;
        else if(op=='*')
            return v1*v2;
        else
            return v1/v2;
    }
}
