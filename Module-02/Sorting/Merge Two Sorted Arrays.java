import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printTheArray(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static int [] mergeTwoSortedArrays(int a[], int n, int b[], int m) {
        int sz = n+m;
        int c[] = new int[sz];
        
        int i=0,j=0,k=0;
        
        while(i < n && j < m) {
            if(a[i] > b[j]) {
                c[k] = b[j];
                j++;
            } else {
                c[k] = a[i];
                i++;
            }
            k++;
        }
        
        while(i<n) {
            c[k] = a[i];
            i++;
            k++;
        }
        
        while(j<m) {
            c[k] = b[j];
            j++;
            k++;
        }
        
        return c;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a [] = new int [n];
        
        for(int i=0;i<n;i++) {
            a[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int b[] = new int[m];
        
        for(int i=0;i<m;i++) {
            b[i] = scn.nextInt();
        } 
        
        int c[] = mergeTwoSortedArrays(a,n,b,m);
        printTheArray(c,c.length);
            
    }
}
