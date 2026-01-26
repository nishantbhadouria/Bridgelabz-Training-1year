import java.util.*;
class evenodd
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=n;i>=1;i--)
{
if(i%2==0)
{
System.out.println("even number"+i);
} else
{
System.out.println("odd number"+i);
}
}
}