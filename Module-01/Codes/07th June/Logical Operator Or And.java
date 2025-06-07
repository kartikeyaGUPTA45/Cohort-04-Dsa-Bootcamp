import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = scn.nextInt();
		
		if (age > 18 && age < 60) {
		    System.out.println("Do some activity");
		} else {
		    System.out.println("Do nothing");
		}
		
		
		if (age == 13 || age == 18) {
		    System.out.println("Good");
		} else {
		    System.out.println("Bad");
		}
	}
}
