 /**
 * 
 */
package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lloyd
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
   while(true) { 
   int n3=0;
   int n2=1; 
   int n1=1;
   int  [] num = new int[n3];
   System.out.println("enter the nth fibonacci");
   int nthF= scanner.nextInt();
     for (int i=1;i<=nthF-2;i++) {
    n3 = n1 + n2 ;
    n1=n2;
    n2=n3;
    num[i] = scanner.nextInt();
    System.out.print(" 1  1 "+Arrays.toString(n3));

     }
     System.out.println("\n");
     if (nthF>2)
     System.out.println(" the  "  +nthF+ " fibonacci number is  "+n3);
     else if (nthF==1 || nthF == 2)
     System.out.println(" the  "+ nthF+ " fibonacci is  "+ (n3==0?1:n3)        );
     }
	}
}
