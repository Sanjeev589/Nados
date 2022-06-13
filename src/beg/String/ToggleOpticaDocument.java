package beg.String;

import java.util.Scanner;

public class ToggleOpticaDocument {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str) {
        String s ="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                char upper = (char) ('A' + c - 'a');
                s += upper;
            } else if (c >= 'A' && c <= 'Z') {
                char lower = (char) ('a' + c - 'A');
                s += lower;
            }
        }
        return s;

    }
    }

