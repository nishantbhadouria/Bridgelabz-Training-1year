import java.util.Scanner;
class EmployeeBonus
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n=10;
double[] salary = new double[n];
double[] yrsOfService = new double[n];
double[] newSalary = new double[n];
double[] bonus = new double[n];
double totalOldSalary=0;
double totalBonus=0;
double totalNewSalary=0; 
for(int i=0;i<n;i++)
{
System.out.println("Enter salary:");
salary[i]=sc.nextDouble();
System.out.println("Enter years of service:");
yrsOfService[i] = sc.nextDouble();
if(salary[i]<=0||yrsOfService[i]<0)
{
System.out.println("Invalid! Enter again");
i--;
continue;
}
totalOldSalary+=salary[i];
}
for(int i=0;i<n;i++)
{
if(yrsOfService[i]>5)
{
bonus[i]=salary[i]*0.05;
}
else
{
bonus[i]=salary[i]*0.02;
}
newSalary[i]=salary[i]+bonus[i];
totalBonus+=bonus[i];
totalNewSalary+=newSalary[i];
}
System.out.println("Total Old Salary="+totalOldSalary);
System.out.println("Total Bonus Paid="+totalBonus);
System.out.println("Total New Salary="+totalNewSalary);
sc.close();
}
}








