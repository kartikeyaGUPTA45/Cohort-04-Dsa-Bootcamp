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
		System.out.println("Enter the marks of 5 subjects: ");
		int m1 = scn.nextInt();
		int m2 = scn.nextInt();
		int m3 = scn.nextInt();
		int m4 = scn.nextInt();
		int m5 = scn.nextInt();
		
		double percentage = ((double)m1+m2+m3+m4+m5)/5.0;
		System.out.println("Precentage is : " + percentage);
		
		
		if (percentage >= 90) { // 90+
		    System.out.println("Grade is A");
		} else if (percentage >= 80) { // 80 -90
		    System.out.println("Grade is B");
		} else if (percentage >= 70) { // 70-80
		    System.out.println("Grade is C");
		} else if (percentage >= 60) { // 60-70
		    System.out.println("Grade is D");
		} else  {
		    System.out.println("Grade is E"); // <60
		}
	}
}
