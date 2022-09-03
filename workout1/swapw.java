import java.util.*;
class swapw
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("enter the 2 number");
a=s.nextInt();
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping"+a+" "+b);
}
}