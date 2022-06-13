package beg.gettingStarted;

public class PrintZ {
    public static void main(String[] args) {
        // Write your code here
        int a = 5;
        for(int i=0;i<a;i++ )
            System.out.print("*");
        System.out.println();
        int temp = a-2;
        while(temp>0)
        {
            for(int i=0;i<temp;i++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
            temp--;
        }
        for(int i=0;i<a;i++ )
            System.out.print("*");
    }
}
