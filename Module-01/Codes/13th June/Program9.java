import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int n = 5;
		
		int i = 1;
		
		while(i<=n) {
		    int j = 1;
		    while(j <= n) {
		        System.out.print(i + " ");
		        j++;
		    }
		    
		    System.out.println();
		    i++;
		}
	}
}
