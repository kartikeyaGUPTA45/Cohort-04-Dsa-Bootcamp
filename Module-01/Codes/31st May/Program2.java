/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
        
	public static void main(String[] args) {
		int a = 10;
        int b = 20;
        int c = 10;
        
        // System.out.println(a == b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a <= b); // true -> when b is greater than a
        // System.out.println(a <= c); // true -> a is equal to c
        
        System.out.println(a >= b); // false -> when a is neither greater than a nor equal to a
        System.out.println(a >= c); // true -> a is equal to c
        
        // Ternary operator
        System.out.println(a >= b ? 35 : 65) // 35 is the o/p when condition is true and 65 is the o/p when condition is false
		
	}
}
