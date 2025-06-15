import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.next();
        
        int i=0,j=str.length()-1;
        
        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("false");
                break;
            }
            
            i++;
            j--;
        }
        
        if (i == j) {
            System.out.println(true);
        }
	}
}
