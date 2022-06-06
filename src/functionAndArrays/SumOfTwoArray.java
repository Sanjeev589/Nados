package functionAndArrays;

import java.util.Scanner;

public class SumOfTwoArray {public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int size1 = sc.nextInt();
    int[] arr1 = new int[size1];
    for(int i=0;i<size1;i++)
        arr1[i] = sc.nextInt();
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
    for(int i=0;i<size2;i++)
        arr2[i] = sc.nextInt();
    int size3 = size1>size2? size1:size2;
    System.out.println(size1+" "+size2+" "+size3);
    int[] arr3 = new int[size3];
    for(int i=0;i<size3;i++){
        if(i<size1 && i<size2)
            arr3[i]= arr1[i]+arr2[i];
        else if(i<size1)
            arr3[i]=arr1[i];
        else
            arr3[i]=arr2[i];
    }
    for(int i=0;i<size3;i++)
        System.out.println(arr3[i]);

}
}
