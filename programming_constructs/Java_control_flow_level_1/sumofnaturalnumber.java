import java.util.Scanner;

class sumofnaturalnumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number=");
int n=sc.nextInt();
if(n>0)
{
int sum=n*(n+1)/2;
System.out.println("The sum of first natural number="+sum);
}
else
{
System.out.println("The number is "+n+" not a natural number");
}
}
}