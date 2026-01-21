import java.util.Scanner;

class largestone
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number=");
int x=sc.nextInt();
System.out.print("Enter second number=");
int y=sc.nextInt();
System.out.print("Enter third number=");
int z=sc.nextInt();
if(x>y&&x>z)
{
System.out.println("First number is the largest number");
}
else if(y>x&&y>z)
{
System.out.println("Second number is the largest number");
}
else
{
System.out.println("First number is the largest number");
}
}
}
