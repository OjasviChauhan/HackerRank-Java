import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        try
        {
            int x,y,r;
            Scanner sc = new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            r=x/y;
           if(y==0)
                 throw  new ArithmeticException("/ by zero");
             else
                 System.out.println(x/y);
        }
        catch(InputMismatchException e)
            {
                System.out.println("java.util.InputMismatchException");
            }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
