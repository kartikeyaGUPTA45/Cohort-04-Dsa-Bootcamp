import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i=0;i<N;i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0;i<M;i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        for(int i=0;i<N;i++) {
            List<Integer> edges = adjList.get(i);
            
            System.out.print(i + " ");
            for(int edge : edges) {
                System.out.print(edge + " ");
            }
            
            System.out.println();
        }
    }
}
