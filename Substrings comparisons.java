import java.util.Scanner;
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        int i,j;
        String smallest = "";
        String largest = "";
        int size = s.length()-k+1;
        String arr[] = new String[size];
        for(i=0;i<size;i++)
            arr[i] = s.substring(i,i+k);
        for(i = 0; i < size-1; ++i) {
            for (j = i + 1; j < size; ++j) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    // swap words[i] with words[j[
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        smallest = arr[0];
        largest = arr[size-1];
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
