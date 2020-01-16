import java.io.*;
import java.util.*;
import java.math.BigInteger; 
public class Solution {

    public static void main(String[] args) {
      BigInteger a,b;
      Scanner sc = new Scanner(System.in);
      a = sc.nextBigInteger();
      b = sc.nextBigInteger();
      BigInteger C = a.add(b);
      BigInteger D = a.multiply(b);
      System.out.println(C + "\n" + D);
    }
}
