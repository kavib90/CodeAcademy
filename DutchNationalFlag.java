  import java.io.*;
  import java.lang.*;
  import java.util.*;
public class Solution {
    public static int[] Sort0s1s2s(int [] arr){
        // Write your code here.
int []A = arr;
        int low = 0 ;  
    int mid = 0 ;  
    int high = arr.length - 1 ;  
    while ( mid <= high )  
    {  
        if ( A [ mid ] == 0 )  
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ low ];  
            A [ low ] = temp ;  
            low = low + 1 ;  
            mid = mid + 1 ;  
          
        }  
        else if ( A [ mid ] == 1 )  
        {  
            mid = mid + 1 ;  
        }  
        else   
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ high ] ;  
            A [ high ] = temp ;  
            high = high - 1 ;  
              
        }  
    }  
    return A;   
    }
}
