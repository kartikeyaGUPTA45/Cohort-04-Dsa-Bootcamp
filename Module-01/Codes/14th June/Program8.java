public class Main
{
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = n/2;
		for(int i=1;i<=n;i++) {
		   for(int j=1;j<=nsp;j++) {
		       System.out.print(" ");
		   } 
		   
		   for(int j=1;j<=nst;j++) {
		       System.out.print("*");
		   }
		   
		   if (i <= n/2) {
		       nst+=2;
		       nsp-=1;
		   } else {
		       nst-=2;
		       nsp+=1;
		   }
		   
		   System.out.println();
		}
		
	}
}
