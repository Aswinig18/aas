import java.io.*;
import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=s.nextInt();
        }
        if(a[0]>a[1])
        {
            if(a[0]>a[2])
            {
                System.out.println(a[0]);
            }
        }
        else
        {
            if(a[1]>a[2])
            {
                System.out.println(a[1]);
            }
        else
        {
            System.out.println(a[2]);       
        }
        }
    }
}
