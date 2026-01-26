import java.util.*;
class sum_till_zero
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double n;
System.out.println("Enter no.(zero to stop");
n=sc.nextDouble();
int sum;
while(n!=0)
{
sum+=n;

n=sc.nextDouble();
System.out.println("Enter new num(Zero to stop));
}
System.out.println("Sum is:"+sum);
}
}
