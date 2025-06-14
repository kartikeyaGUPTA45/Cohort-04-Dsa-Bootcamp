public class Main
{
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = n-1;
		char ch = 'A';
		for(int i=1;i<=n;i++) {
		   for(int j=1;j<=nsp;j++) {
		       System.out.print(" ");
		   }
		   
		   for(int j=1;j<=nst;j++) {
		       System.out.print(ch);
		   }
		   
		   System.out.println();
		   nsp-=1;
		   nst+=1;
		   ch+=1;
		}
		
	}
}
