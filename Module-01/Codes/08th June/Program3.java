import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
// 		for(int i=1;i<=n;i++) {
// 		    System.out.print(i + " ");
// 		}

        int i=1;
        
        while(i<=n) {
            System.out.print(i + " ");
            i++;
        }
		
		
	}
}
