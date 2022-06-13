package beg.gettingStarted;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            digits.add(digit);
            num /= 10;
        }
        for (int i = digits.size() - 1; i >= 0; i--)
            System.out.println(digits.get(i));
    }
    }
