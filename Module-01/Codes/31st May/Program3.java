/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        
	public static void main(String[] args) {
		double c = -40;
		double f = c*(9/5)+32; => first perform 9/5 => int * double => double
		double ff = (c*9/5)+32; => double * int => double /int => double + 32 => double
		double fff = (c*(9/5)) + 32; => int/int => int * double => double + int => double
		
		System.out.println(ff);
	}
}
