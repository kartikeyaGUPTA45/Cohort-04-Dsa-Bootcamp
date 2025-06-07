import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = scn.next().charAt(0);
		
		switch(ch) {
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':   
		    case 'A':
		    case 'E':
		    case 'I':
		    case 'O':
		    case 'U':
		        System.out.println("Vowel");
		        break;
		  default:
		        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		            System.out.println("Consonant");
		        else {
		            System.out.println("It's not a consonant or vowel");
		        }      
		}
		
	}
}
