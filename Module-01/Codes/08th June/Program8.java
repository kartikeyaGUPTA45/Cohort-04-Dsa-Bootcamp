import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
// 		for(int i=n;i>0;i/=10) { 
// 		    int ans = i%10;
// 		    System.out.println(ans);
// 		}
		

        
        int i=n;
        while(i>0) {
            int ans = i%10;
            System.out.println(ans);
            i/=10;
        }
	}
}
