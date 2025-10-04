import java.io.*;
import java.util.*;

public class Solution {
    
    public static void printTheArray(int arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
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
    
    public static int [] mergeSort(int arr[], int low, int high) {
        if (low == high) {
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }
        
        int mid = (low + high)/2;
        int fh[] = mergeSort(arr, low, mid);
        int sh[] = mergeSort(arr, mid+1, high);
        return mergeTwoSortedArrays(fh, fh.length, sh, sh.length);
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int ans [] = mergeSort(arr,0,n-1);
        printTheArray(ans, n);
    }
}
