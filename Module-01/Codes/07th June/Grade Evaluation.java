import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the grade: ");
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		    case 'A':
		        System.out.println("Excelelnt");
		        break;
		    case 'B':
		        System.out.println("Good");
		        break;
		    case 'C':
		        System.out.println("Fair");
		        break;
		    case 'D':
		        System.out.println("Average");
		        break;
		    case 'E':
		        System.out.println("Need Improvement");
		        break;
		    default:
		        System.out.println("Fail");
		}
	}
}
