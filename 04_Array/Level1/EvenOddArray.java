import java.util.Scanner;
class EvenOddArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number = sc.nextInt();
if(number<=0)
{
System.out.println("Invalid input! Enter a natural number");
return;
}
int size=number/2+1;
int[] even = new int[size];
int[] odd = new int[size];
int eIndex=0,oIndex=0;
for(int i=1;i<=number;i++)
{
if(i%2==0)
{
even[eIndex]=i;
eIndex++;
}
else
{
odd[oIndex]=i;
oIndex++;
}
}
System.out.print("Odd Numbers: ");
for(int i=0; i<oIndex;i++)
{
System.out.print(odd[i]+" ");
}
System.out.print("\nEven Numbers: ");
for(int i=0; i<eIndex;i++)
{
System.out.print(even[i]+" ");
}
sc.close();
}
}