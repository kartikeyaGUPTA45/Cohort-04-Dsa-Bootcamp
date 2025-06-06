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
		System.out.println("Enter the numbers: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if (a > b) {
		    System.out.println("A is greater than B");
		} else {
		    System.out.println("B is grater than A");
		}
	}
}
