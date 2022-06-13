package beg.functionAndArrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int val = sc.nextInt();
        int min = 0;
        for(int i=0;i<n;i++){
            if(val==arr[i])
            {
                System.out.println(val);
                break;
            }
            if(val>arr[i])
                min=i;
            else
                break;
        }
        if(min==0)
            System.out.println(arr[min]);
        else if(min==arr.length-1)
            System.out.println(arr[min]);
        else
            System.out.println(arr[min+1]+"\n"+arr[min]);
    }
}
