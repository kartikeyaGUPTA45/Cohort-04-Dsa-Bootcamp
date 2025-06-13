import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the userName: ");
		String userName = scn.next();
		System.out.println("Enter the password");
		String password = scn.next();
		
		String validUserName = "abcd";
		String validPassword = "efgh";
		
		if (userName.equals(validUserName)) {
		    if (password.equals(validPassword)) {
		        System.out.println("Login Successful");
		    } else {
		        System.out.println("Invalid Password");
		    }
		} else {
		    System.out.println("Invalid userName");
		}
	}
}
