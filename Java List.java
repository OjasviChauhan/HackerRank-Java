import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String I = "Insert";
      String D = "Delete";
      int N = sc.nextInt();
      ArrayList<Integer> a1 = new ArrayList<Integer>(N);
      for(int i=0;i<N;i++)
          a1.add(sc.nextInt());
      int Q = sc.nextInt();
      for(int i=0;i<Q;i++){
          String k = sc.next();
          if(k.equals(I)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a1.add(a,b);
          }
          else{
              int c = sc.nextInt();
              a1.remove(c);
          }
      }
      for (int i=0; i<a1.size(); i++) 
            System.out.print(a1.get(i)+" "); 
    }
}
