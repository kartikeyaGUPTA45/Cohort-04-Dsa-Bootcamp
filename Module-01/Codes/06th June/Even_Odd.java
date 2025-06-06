/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = scn.nextInt();
		
		if (a%2 == 0) {
		    System.out.println("Number is even");
		} else {
		    System.out.println("Number is odd");
		}
	}
}
