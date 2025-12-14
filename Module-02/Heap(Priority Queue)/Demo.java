import java.io.*;
import java.util.*;

public class Solution {
    
    private static void minPQ() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // minHeap
        
        pq.add(10);
        pq.add(20);
        pq.add(45);
        pq.add(-10);
        pq.add(-50);
        pq.add(100);
        
        System.out.println("Size: " + pq.size());
        System.out.println("Peek: " + pq.peek());
        
        while(pq.size() > 0) {
            System.out.println(pq.poll());
        }
    }
    
    
    private static void maxPQ() {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
        
        pq.add(10);
        pq.add(20);
        pq.add(45);
        pq.add(-10);
        pq.add(-50);
        pq.add(100);
        
        System.out.println("Size: " + pq.size());
        System.out.println("Peek: " + pq.peek());
        
        while(pq.size() > 0) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // minPQ();
        maxPQ();
    }
}
