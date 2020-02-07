import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String []arr = s.trim().split("[ !,?._'@]+");
        if (s == null || s.trim().equals("")) 
           System.out.println("0");
        else if(s.length()>400000){
            return;
        }
        else{
        int k = arr.length;
        System.out.println(k);
        for(String a : arr)
            System.out.println(a);
        scan.close();
    }
    }
}
