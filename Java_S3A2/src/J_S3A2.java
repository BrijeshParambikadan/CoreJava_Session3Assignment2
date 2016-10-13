/*a Java statement to assign the value true to the boolean variable same , 
 * when the String variable S1 has the same contents as the String variable S2 , 
 * and false otherwise
 */

import java.util.Scanner;

public class J_S3A2 {

	public static void main(String[] args) {
		Scanner bbin=new Scanner(System.in);

		System.out.println("Enter value for String Variable S1 : ");
		String S1=bbin.next();

		System.out.println("Enter value for String Variable S2 : ");
		String S2=bbin.next();

		if(S1.equals(S2))
		{
		Boolean same=true;
		System.out.println("Value of S1 is "+S1+" and value of S2 is "+S2);

		System.out.println("Value of same is "+ same);
		}
		else
		{
		Boolean same=false;
		System.out.println("\nValue of S1 is "+S1+" and value of S2 is "+S2);

		System.out.println("Value of same is "+ same);
		}
		

	}

}

//Thank You