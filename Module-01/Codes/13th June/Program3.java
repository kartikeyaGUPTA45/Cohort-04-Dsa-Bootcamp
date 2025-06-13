import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = scn.next().charAt(0);
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
		    System.out.println("Alphabet");
		    if (ch >= 'a' && ch <= 'z') {
		        System.out.println("Lowercase");
		    } else {
		        System.out.println("Uppercase");
		    }
		} else if (ch >= '0' && ch <= '9') {
		    System.out.println("Digit");
		} else {
		    System.out.println("Special Symbol");
		}
	}
}
