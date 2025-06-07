import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		    case 'a':
		        System.out.println("Vowel");
		        break;
		   case 'e':
		        System.out.println("Vowel");
		        break;
		  case 'i':
		        System.out.println("Vowel");
		        break;
		  case 'o':
		        System.out.println("Vowel");
		        break;
		  case 'u':
		        System.out.println("Vowel");
		        break;  
		  default:
		        System.out.println("Consonant");
		}
		
	}
}
