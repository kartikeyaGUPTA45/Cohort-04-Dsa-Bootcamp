import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		int factorial = 1;
// 		for(int i=2;i<=n;i++) { 
// 		    factorial*=i;
// 		}
		

        
        int i=2;
        while(i<=n) {
            factorial*=i;
            i++;
        }
        
        System.out.print(factorial);
		
		
	}
}
