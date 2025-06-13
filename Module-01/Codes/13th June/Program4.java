import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the units: ");
		
		int units = scn.nextInt();
		int price = 0;
		
		if (units < 100) {
		    price = units*3;
		} else if (units >= 100 && units < 200) {
		    int lessThan100 = 100;
		    int greaterThan100 = units-100;
		    
		    price = lessThan100 * 3 + greaterThan100 * 5;
		} else {
		    int lessThan100 = 100;
		    int lessThan200 = 100;
		    int greaterThan200 = units - 200;
		    
		    price  = lessThan100 * 3 + lessThan200 * 5 + greaterThan200 * 7;
		}
		
		
		System.out.println("Electricity Bill is: " + price);
	}
}
