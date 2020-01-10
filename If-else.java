import java.util.*;
public class Ifelse
{
    public static void main(String arg[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n%2!=0 || n>=6 && n<=20)
        System.out.println("Weird");
        else
        System.out.println("Not Weird");
    }
}
