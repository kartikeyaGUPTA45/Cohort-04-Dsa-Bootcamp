import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("India", 100);
        map.put("Nepal", 10);
        
        System.out.println(map);
        
        map.put("India", 120);
        
        System.out.println(map);
        System.out.println(map.size());
        
        System.out.println(map.get("Australia"));
        
        System.out.println(map.getOrDefault("Australia", 50));
        System.out.println(map.getOrDefault("India", 50));
        
        System.out.println(map.containsKey("India")); // Output is in boolean format
    }
}
