
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		int sum = 0;
// 		for(int i=n;i>0;i/=10) { 
// 		  sum += (i%10);
// 		}
		

        
        int i=n;
        while(i>0) {
            sum += (i%10);
            i/=10;
        }
        
        System.out.println(sum);
	}
}
