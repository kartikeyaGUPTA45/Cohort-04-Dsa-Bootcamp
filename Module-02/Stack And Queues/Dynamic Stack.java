import java.io.*;
import java.util.*;

class CustomStack {
  
  int arr[];
  int top;

  CustomStack(int capacity) {
    arr = new int[capacity];
    top = 0;  
  }
  
  void push(int data) {
    if (top == arr.length) {
        int newArr[] = new int[2*arr.length];
        for(int i=0;i<arr.length;i++) {
            newArr[i] = arr[i];
        }
        
        arr = newArr;
    }
      arr[top] = data;
      top+=1;
  }
  
  void pop() {
      if (top == 0) {
          System.out.println("Stack underflow");
          return;
      }

      System.out.println(arr[top-1]);
      top-=1;
  }
  
  void display() {
    for(int i = top-1; i>=0;i--) {
        System.out.print(arr[i] + " ");
    }

    System.out.println();  
  }
  
  void top() {
    if (top == 0) {
          System.out.println("Stack underflow");
          return;
     }

      System.out.println(arr[top-1]);
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
