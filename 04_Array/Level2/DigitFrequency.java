import java.util.Scanner;
class DigitFrequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
int temp=number;
int count=0;
while(temp!=0)
{
count++;
temp=temp/10;
}
int digits[]=new int[count];
temp=number;
int index=0;
while(temp!=0)
{
digits[index]=temp%10;
temp=temp/10;
index++;
}
int frequency[]=new int[10];
for(int i=0;i<count;i++)
{
frequency[digits[i]]++;
}
System.out.println("Digit\tFrequency");
for(int i=0;i<10;i++)
{
if(frequency[i]>0)
{
System.out.println(i+"\t"+frequency[i]);
}
}
sc.close();
}
}