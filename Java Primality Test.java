import java.util.*;
import java.math.BigInteger;
public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}
