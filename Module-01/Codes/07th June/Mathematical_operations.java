import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		double num1 = scn.nextDouble();
		double num2 = scn.nextDouble();
		
		char ch = scn.next().charAt(0);
		
		
		switch(ch) {
		    case '+':
		        System.out.println(num1+num2);
		        break;
		    case '-':
		        System.out.println(num1-num2);
		        break;
		    case '*':
		        System.out.println(num1*num2);
		        break;
		    case '/':
		        System.out.println(num1/num2);
		        break;
		}
		
		
	}
}
