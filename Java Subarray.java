import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       int i,j,n,count=0,sum=0;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int arr[] = new int[n];
       for(i=0;i<arr.length;i++)
         arr[i] = sc.nextInt();
       for(i=0;i<arr.length;i++){
           for(j=i;j<arr.length;j++){
                int copy[] = Arrays.copyOfRange(arr,i,j+1);
                for(int k : copy) 
                    sum+=k;
                if(sum < 0) count++;
                sum=0;     
           }
       }
        System.out.print(count);
    }
}
