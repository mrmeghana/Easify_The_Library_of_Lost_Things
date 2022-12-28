import java.io.*;
import java.util.*;
import java.lang.*;
public class Maximum_boxes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(Math.min(a,b)>=c)
            {
                System.out.println(Math.min(a,b));
            }
            else
            {
                int sum=(a+b+c)/3;
                System.out.println(Math.min(sum,Math.min(a,b)));
            }
        }
    }
}
