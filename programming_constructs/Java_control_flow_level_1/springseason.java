import java.util.Scanner;

class springseason
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter month(1-12)=");
int month=sc.nextInt();
System.out.print("enter day=");
int day=sc.nextInt();
if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20))
{
System.out.println("it`s a spring season");
}
else
{
System.out.println("it`s not a spring season");
}
}
}