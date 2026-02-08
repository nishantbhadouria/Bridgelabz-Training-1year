import java.util.Scanner;
class FizzBuzz
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a number:");
int num = sc.nextInt();
String[] results = new String[num+1];
if(num>0)
{
for(int i=0;i<=num;i++)
{
if(i%3==0 && i%5==0)
results[i]="FizzBuzz";
else if(i%3==0)
results[i]="Fizz";
else if(i%5==0)
results[i]="Buzz";
else 
results[i]=String.valueOf(i);
}
for(int i=0;i<results.length;i++)
{
System.out.print("Position "+i+" = "+results[i]+ " , ");
}
}
else
{
System.out.println("Enter a natural number:");
}
sc.close();
}
}
