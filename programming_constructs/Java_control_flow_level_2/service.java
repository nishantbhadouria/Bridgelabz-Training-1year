import java.util.*;
class service
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter year & salary");
int year=sc.nextInt();
int salary=sc.nextInt();
if(year>5)
{
double bonus = salary*5/100
salary+=bonus;
System.out.println("Bonus"+bonus);
System.out.println("New salary"+salary);
} else
{
	System.out.println("No bonus");
}
}
}