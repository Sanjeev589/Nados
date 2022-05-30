package pattern;

import java.util.Scanner;
/*      *	*	*		*	*	*
        *	*				*	*
        *						*
        *	*				*	*
        *	*	*		*	*	*

 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space =1;
        int star =n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=star;j++)
                System.out.print("*\t");
            for(int k=0;k<space;k++)
                System.out.print("\t");
            for(int l=star;l>=0;l--)
                System.out.print("*\t");
            System.out.println();
            if(i<n/2){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
        }

    }
}
