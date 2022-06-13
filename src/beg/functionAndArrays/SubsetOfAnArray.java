package beg.functionAndArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubsetOfAnArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = (int)Math.pow(2,arr.length);
        for(int i=0;i<max;i++){
            String set ="";
            int temp= i;
            for(int j=arr.length-1;j>=0;j--){
                if(temp%2==0)
                    set="-\t"+set;
                else
                    set=arr[j]+"\t"+set;
                temp/=2;
            }
            System.out.println(set);
        }


    }
}
