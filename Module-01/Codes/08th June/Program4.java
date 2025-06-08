import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
// 		for(int i=2;i<=n;i+=2) { // 2 4 6 8 10
// 		    System.out.print(i + " ");
// 		}
		
// 		for(int i=1;i<=n;i++) {
// 		    if (i%2 == 0) {
// 		        System.out.print(i + " ");
// 		    }
// 		}

        // int i=2;
        
        // while(i<=n) {
        //     System.out.print(i + " ");
        //     i+=2;
        // }
        
        int i=1;
        
        while(i<=n) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
            i+=1;
        }
		
		
	}
}
