/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int age = 16;
		
		if (age >= 18) { // Nested Conditional Statement
		    System.out.println("Eligible for voting");
		    if (age >= 21) {
		        System.out.println("Eligible for driving license");
		    } else {
		        System.out.println("Not Eligible for driving license");
		    }
		} else {
		    System.out.println("Not Eligible for voting");
		}
	}
}
