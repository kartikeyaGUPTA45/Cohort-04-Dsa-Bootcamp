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
		double p = scn.nextDouble();
		double r = scn.nextDouble();
		int t = scn.nextInt();
		
		double si = (p*r*t)/100;
		
		System.out.println("SI is: " + si);
	}
}
