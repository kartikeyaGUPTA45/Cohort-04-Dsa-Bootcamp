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
		int m1 = scn.nextInt();
		int m2 = scn.nextInt();
		int m3 = scn.nextInt();
		int m4 = scn.nextInt();
		int m5 = scn.nextInt();
		
		double avg = ((double)m1 + m2+m3+m4+m5)/5;
		
		System.out.println("Average is: " + avg);
	}
}
