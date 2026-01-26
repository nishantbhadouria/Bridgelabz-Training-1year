import java.util.*;
class Spring
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the month and day");
int month=sc.nextInt();
int day=sc.nextInt();
if(month==3 && day>=20||month==4||month==5||month ==6 &&day<=20)
{
System.out.println("It is a Spring season");
} else
{
System.out.println("It is not a Spring season");
}
}
}