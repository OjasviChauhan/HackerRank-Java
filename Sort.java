import java.util.*;
class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id[] = new int[n];
        String name[] = new String[n];
        double cgpa[] = new double[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            id[i] = sc.nextInt();
            name[i] = sc.next();
            cgpa[i] = sc.nextDouble();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(cgpa[j] > cgpa[j+1])
                {
                    double temp = cgpa[j+1];
                    cgpa[j+1] = cgpa[j];
                    cgpa[j] = temp;
            
                    String temp1 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = temp1;

                    int temp2 = id[j+1];
                    id[j+1] = id[j];
                    id[j] = temp2;
                }
                else if(cgpa[j] == cgpa[j+1])
                {
                    if(name[j].compareTo(name[j+1]) < 0)
                    {
                    String temp3 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp3;

                    int temp4 = id[j+1];
                    id[j+1] = id[j];
                    id[j] = temp4;   
                    }  
                }
            }
        }
        for(i=n-1;i>=0;i--)
        System.out.println(name[i]);
    }
}
