import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
// 		for(int i=1;i<=10;i++) { 
// 		    System.out.println(n + "*" + i + "=" + (n*i));
// 		}
		

        
        int i=1;
        while(i<=10) {
            System.out.println(n + "*" + i + "=" + (n*i));
            i++;
        }
	}
}
