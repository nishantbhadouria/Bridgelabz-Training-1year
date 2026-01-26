import java.util.*;
class SumNaturalFor
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num");
int n=sc.nextInt();
if(n<=0)
{
System.out.println("Not a natural number");
} else
{
int sumfor=0;
for(int i=1;i<=n;i++)
{
sumfor+=i;
}
int sumformula=n*(n+1)/2;
System.out.println("Sum by using loop"+ sumfor);
System.out.println("sum by formula"+sumformula);
if(sumfor==sumformula)
{
System.out.println("Same sum ");
} else
{
System.out.println("Not sum");
}
}
}
