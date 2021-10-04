import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        int k=0;
        
        for (int i = 0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }
         for (int i = 0; i<n; i++)
         {
    
             if(arr1[i] != 0){
                 arr2[k++] = arr1[i]; 
                 
             }
            
         }
         
        for( int i =0; i<n; i++)
        {
             System.out.print(arr2[i] +" ");
        }
        }
         
       
        
    }
