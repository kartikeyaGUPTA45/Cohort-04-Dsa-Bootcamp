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
		System.out.println("Enter the month number: ");
		int a = scn.nextInt();
		
		if (a == 1) { 
		    System.out.println("Month is Jan");
		} else if (a == 2) { 
		    System.out.println("Month is Feb");
		} else if (a == 3) { 
		    System.out.println("Month is Mar");
		} else if (a == 4) { 
		    System.out.println("Month is Apr");
		} else if (a == 5) { 
		    System.out.println("Month is May");
		} else if (a == 6) { 
		    System.out.println("Month is Jun");
		} else if (a == 7) { 
		    System.out.println("Month is Jul");
		} else if (a == 8) { 
		    System.out.println("Month is Aug");
		} else if (a == 9) { 
		    System.out.println("Month is Sep");
		} else if (a == 10) { 
		    System.out.println("Month is Oct");
		} else if (a == 11) { 
		    System.out.println("Month is Nov");
		} else if (a == 12) { 
		    System.out.println("Month is Dec");
		} else  { 
		    System.out.println("Invalid input");
		}
	}
}
