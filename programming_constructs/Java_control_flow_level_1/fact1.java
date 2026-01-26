import java.util.*;
class fact1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num");
int num=sc.nextInt();
if(num<0)
{
System.out.println("not a Natural number");
} else 
{
int fact=1;
for(int i=1;i<=num;i++)
{
fact*=i;
}
System.out.println("fact is"+fact);
}
}
}