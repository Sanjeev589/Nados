package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversion {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> val = new Stack();
        Stack<String> prefix = new Stack();
        Stack<String> infix = new Stack();


        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch-'0'); // convert from char to int
                prefix.push(ch+""); // convert form char to str
                infix.push(ch+"");
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 = val.pop();
                int v1 = val.pop();
                val.push(evaluate(v1, v2, ch));
                String s2 = prefix.pop();
                String s1 = prefix.pop();
                prefix.push(ch+s1+s2+"");
                s2 = infix.pop();
                s1 = infix.pop();
                infix.push("("+s1+ch+s2+")");
            }
        }

        System.out.println(val.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());

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
