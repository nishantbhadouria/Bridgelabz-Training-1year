import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
int temp=num;
int count=0;
while(temp!=0)
{
count++;
temp=temp/10;
}
int digits[]=new int[count];
temp=num;
for(int i=0;i<count;i++)
{
digits[i]=temp%10;
temp=temp=temp/10;
}
int reverse[]=new int[count];
for(int i=count-1;i>=0;i--)
{
reverse[i]=digits[i];
}
System.out.println("Reversed number is:");
for(int i=0;i<count;i++)
{
System.out.print(reverse[i]);
}
sc.close();
}
}

