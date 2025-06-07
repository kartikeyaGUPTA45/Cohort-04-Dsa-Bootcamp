import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int a = scn.nextInt();
		
	    switch(a) {
	        case 1:
	            System.out.println("Month is Jan");
	           // break;
	        case 2:
	            System.out.println("Month is Feb");
	           // break;  
	       case 3:
	            System.out.println("Month is Mar");
	           // break; 
	       case 4:
	            System.out.println("Month is Apr");
	           // break;
	       case 5: 
	           System.out.println("Month is May");
	           break;
	       case 6:
	            System.out.println("Month is Jun");
	            break;
	       case 7:
	            System.out.println("Month is Jul");
	           // break;
	       case 8:
	            System.out.println("Month is Aug");
	           // break;
	       case 9:
	            System.out.println("Month is Sep");
	           // break;
	       case 10:
	            System.out.println("Month is Oct");
	           // break;
	       case 11:
	            System.out.println("Month is Nov");
	           // break;
	       case 12:
	            System.out.println("Month is Dec");
	           // break;
	       default:
	            System.out.println("Invalid input");
	       
	            
	    }
	}
}
