import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StringBuilder sb = new StringBuilder();
        
        sb.append("abc");
        
        System.out.println(sb);
        System.out.println("Length of Sb: " + sb.length());
        System.out.println("Char At index 1: " + sb.charAt(1));
        
        sb.setCharAt(1, 'e');
        System.out.println("Updated SB: " + sb);
        
        System.out.println("As String: " + sb.toString());
    }
}
