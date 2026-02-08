import java.util.Scanner;
class LargestAndSecondLargest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
long number = sc.nextLong();
int maxDigit=10;
long digits[]=new long[maxDigit];
int index=0;
while(number!=0)
{
if(index==maxDigit)
{
maxDigit+=10;
long temp[]=new long[maxDigit];
for(int i=0;i<digits.length;i++)
{
temp[i]=digits[i];
}
digits=temp;
}
digits[index]=number%10;
number=number/10;
index++;
}
long largest=0;
long secondLargest=0;
for(int i=0;i<maxDigit;i++)
{
if(digits[i]>largest)
{
secondLargest=largest;
largest=digits[i];
}
else if(digits[i]>secondLargest && digits[i]!=largest)
{
secondLargest=digits[i];
}
}
System.out.println("Largest number is: "+largest+" and second largest number is: "+secondLargest);
sc.close();
}
}




