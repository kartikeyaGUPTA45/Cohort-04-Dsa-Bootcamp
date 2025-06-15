import java.util.*;

public class Main {
    
    public static int factorial(int n) {
        int ans = 1;
        
        for(int i=1;i<=n;i++) {
            ans *= i;
        }
        
        return ans;
    }
    
    
	public static void main(String[] args) {
        int n = 5;
        int r = 2;
        
        
        int ans1 = factorial(n);
        int ans2 = factorial(r);
        int ans3 = factorial(n-r);
        
        int ans = (ans1)/(ans2*ans3);
        
        System.out.println(ans);
	}
	
	
}
