package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> pre = new Stack();
        Stack<String> post = new Stack();
        Stack<Character> opr = new Stack();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='(')
                opr.push(ch);
            else if (ch==')'){
                while(opr.peek()!='('){
                    char op = opr.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op+v1+v2);
                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1+v2+op);
                }
                opr.pop();

            }else if(ch == '+' || ch =='-' ||ch=='*'|| ch=='/'){
                while(opr.size()>0 && (opr.peek()!='(') && precedence(ch)<=precedence(opr.peek())){
                    char op = opr.pop();
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    pre.push(op+v1+v2);
                    v2 = post.pop();
                    v1 = post.pop();
                    post.push(v1+v2+op);
                }
                opr.push(ch);
            }else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                pre.push(ch+"");
                post.push(ch+"");
            }
        }
        while(opr.size()>0){
            char op = opr.pop();
            String v2 = pre.pop();
            String v1 = pre.pop();
            pre.push(op+v1+v2);
            v2 = post.pop();
            v1 = post.pop();
            post.push(v1+v2+op);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    public static int precedence(char ch){
        if(ch=='+' || ch=='-')
            return 1;
        else
            return 2;
    }
}
