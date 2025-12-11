import java.io.*;
import java.util.*;

class CustomStack {
  
  CustomStack(int capacity) {
   
  }
  
  void push(int data) {
    
  }
  
  void pop() {
    
  }
  
  void display() {
   
  }
  
  void top() {
    
  }
}

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int capacity = scn.nextInt();
      String s ="";
      CustomStack cs = new CustomStack(capacity);
      
      while(scn.hasNext()) {
        s = scn.next();
        if (s.equals("push")) {
          int data = scn.nextInt();
          cs.push(data);
        } else if (s.equals("pop")) {
          cs.pop();
        } else if (s.equals("top")) {
          cs.top();
        } else if (s.equals("display")) {
          cs.display();
        } else {
          break; // break the loop
        }
      }
    }
}
