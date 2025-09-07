import java.util.*;

public class Main
{
    public static void printSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.println("Answer is: " + ans);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        // Part of Answer
        printSubsequence(ros, ans + ch);
        
        // Not part of Answer
        printSubsequence(ros, ans);
    }
    
	public static void main(String[] args) {
		String str = "abc";
		printSubsequence(str, "");
	}
}
