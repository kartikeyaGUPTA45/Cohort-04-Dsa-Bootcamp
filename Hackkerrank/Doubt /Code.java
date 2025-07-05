import java.io.*;
import java.util.*;

public class Solution {
    
    public static void AddArray(int arr1[],int n1,int arr2[],int n2){
        int n=Math.max(n1,n2)+1;
        int arr[]=new int [n];
        int sum=0;
        int rem=0;
        int carry=0;
        int k = n-1;
        for(int i=n1-1,j=n2-1;i>=0 || j>=0 ;i--,j--){
            sum=carry;
            if (i >= 0) sum += arr1[i];
            if (j >= 0) sum += arr2[j];
            rem=sum%10;
            carry=sum/10;
            arr[k]=rem;
            k--;
         }
        int lzero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                lzero++;
        }
        
        if (lzero == n) {
            System.out.println(0);
        }
        
        
        for(int i=lzero;i<n;i++)
            System.out.println(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]=new int [n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int arr2[]=new int [n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        AddArray(arr1,n1,arr2,n2);
    }
}
