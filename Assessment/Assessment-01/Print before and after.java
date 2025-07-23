import java.io.*;
import java.util.*;

public class Solution {
    
    public static void beforeAndAfterCharacter(char ch) {
        char before = (ch == 'a') ? 'z' : (char)(ch-1);
        char after = (ch == 'z') ? 'a' : (char)(ch+1);
        
        System.out.println(after + " " + before);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        beforeAndAfterCharacter(ch);
    }
}
