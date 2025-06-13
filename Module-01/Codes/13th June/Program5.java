import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the price: ");
		int price = scn.nextInt();
		System.out.println("Enter the type of customer: p -> premium or n -> normal");
		char ch = scn.next().charAt(0);
		
		if (price > 1000) {
		    if (ch == 'p') {
		        price -= (price*20)/100;
		    } else {
		        price -= (price*10)/100;
		    }
		} else {
		    if (ch == 'p') {
		        price -= (price*5)/100;
		    } else {
		        price -= (price*2)/100;
		    }
		}
		
		System.out.println("Final Price: " + price);
	}
}
