import java.util.*;
public class Javaloop
{
    public static void main(String args[])
    {
        int num,i;
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
