import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        
        int adjMat[][] = new int[N][N];
        
        for(int i=0;i<M;i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            
            adjMat[u][v] = 1;
            adjMat[v][u] = 1;
        }
        
        for(int i=0;i<N;i++) {
            System.out.print(i + " ");
            for(int j=0;j<N;j++) {
                if (adjMat[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            
            System.out.println();
        }
    }
}
