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
		System.out.println("Enter your age: ");
		int age = scn.nextInt();
		
		if (age >= 18) {
		    System.out.println("Eligible for Voting");
		}
	}
}
