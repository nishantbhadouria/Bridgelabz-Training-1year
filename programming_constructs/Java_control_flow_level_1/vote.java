import java.util.Scanner;

class vote
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number=");
int n=sc.nextInt();
if(n==18)
{
System.out.println("The person age is "+n+" and can vote");
}
else if(n>18)
{
System.out.println("The person age is "+n+" and can vote");
}
else
{
System.out.println("The person age is "+n+" and can not vote");
}
}
}
