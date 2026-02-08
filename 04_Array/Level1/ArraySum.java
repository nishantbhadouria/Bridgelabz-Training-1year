import java.util.Scanner;
class ArraySum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double[] arr = new double[10];
double total=0.0;
int i=0;
while(true)
{
System.out.println("Enter number:");
double num = sc.nextDouble();
if(num<=0||i==10)
break;
arr[i]=num;
i++;
}
for(i=0;i<10;i++)
{
total=total+arr[i];
}
System.out.println("Total Sum= "+total);
sc.close();
}
}
