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
		System.out.println("Enter the cost price: ");
		int price = scn.nextInt();
		System.out.println("Enter the age: ");
		int age = scn.nextInt();
		
		if (age < 13) {
		    price -= (price/2); // price = price - (price/2)
		} else if (age > 60) {
		    price -= ((price*3)/10);
		}
		
		System.out.println("Final Price: " + price);
		
	}
}
