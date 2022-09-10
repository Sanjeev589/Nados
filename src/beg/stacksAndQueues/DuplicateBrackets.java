package beg.stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        Stack<Character> stck = new Stack();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch==')'){
                if(stck.peek()=='(')
                {
                    System.out.println("true");
                    return;
                }else{
                    while(stck.peek()!='(')
                        stck.pop();
                    stck.pop();
                }

            }
            else
                stck.push(ch);
        }
        System.out.println("false");
    }
}
