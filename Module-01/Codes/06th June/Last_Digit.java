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
		int rem = a%10;
		if (rem == 0) {
		    System.out.println("Last digit is zero");
		} else {
		    System.out.println("Last digit is not zero");
		}
	}
}
