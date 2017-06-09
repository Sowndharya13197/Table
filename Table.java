import java.io.*;
import java.util.Scanner;
public class Table 
{
    public static void main(String args[])
    {int i,m,ss ;
    Scanner s=new Scanner(System.in);
    m=s.nextInt();
    for(i=1;i<=10;i++)
    {  ss=m*i;
    System.out.print(i);
     System.out.print("*");
     System.out.print(m);
             System.out.print("=");
               System.out.println(ss);
    }}
}
