import java.util.*;

public class Main
{
	public static void main(String[] args) {
        int n = 5;
        int r = 2;
        
        
        int ans1 = 1;
        
        for(int i=1;i<=n;i++) {
            ans1 *= i;
        }
        
        int ans2 = 1;
        
        for(int i=1;i<=r;i++) {
            ans2*=i;
        }
        
        int ans3 = 1;
        
        for(int i=1;i<=(n-r);i++) {
            ans3 *= i;
        }
        
        
        int ans = (ans1)/(ans2*ans3);
        
        System.out.println(ans);
        
	}
}
