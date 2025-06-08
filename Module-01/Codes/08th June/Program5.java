import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) { 
		    sum+=i;
		}
		

        
        // int i=1;
        // int sum = 0;
        // while(i<=n) {
        //     sum+=i;
        //     i++;
        // }
        
        System.out.print(sum);
		
		
	}
}
