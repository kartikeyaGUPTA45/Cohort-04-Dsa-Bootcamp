import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = scn.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    System.out.println("Vowel");
		} else {
		    System.out.println("Consonant");
		}
		
	}
}
