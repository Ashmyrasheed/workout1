import java.util.*;
public class Largestnumber
{
public static void main(String args[])
{
int a,b,c,largest;
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();
System.out.println("enter the third number");
c=sc.nextInt();
largest=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("largest number is:"+largest);
}
}

