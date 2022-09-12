package beg.stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> operand = new Stack();
        Stack<Character> operation = new Stack();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('){
                operation.push(ch);
            }else if(ch==')'){
                while(operation.peek()!='('){
                    char op = operation.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    operand.push(operation(v1, v2, op));
                }
                operation.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' ||ch=='/'){
                while(operation.size()>0 && operation.peek()!='(' && precedence(ch)<=precedence(operation.peek()))
                {

                    char op = operation.pop();
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    operand.push(operation(v1, v2, op));

                }
                operation.push(ch);
            }else if(Character.isDigit(ch)){
                operand.push(ch-'0'); //char to int
            }

        }
        while(operation.size()!=0){
            char op = operation.pop();
            int v2 = operand.pop();
            int v1 = operand.pop();
            operand.push(operation(v1, v2, op));
        }
        System.out.println(operand.peek());
    }

    public static int precedence(char ch){
        if(ch =='+' || ch=='-')
            return 1;
        else
            return 2;
    }

    public static int operation(int v1, int v2, char op){
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
